package Day25.IPLSensorAnalysis;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

class IPLCensorAnalyzer {
    public static void main(String[] args) {
        String jsonInputPath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\IPLSensorAnalysis\\matches.json";
        String csvInputPath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\IPLSensorAnalysis\\matches.csv";
        String jsonOutputPath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\IPLSensorAnalysis\\";
        String csvOutputPath = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\IPLSensorAnalysis\\";

        try {
            censorJsonData(jsonInputPath, jsonOutputPath);
            System.out.println("Censored JSON file generated: " + jsonOutputPath);

            censorCsvData(csvInputPath, csvOutputPath);
            System.out.println(" Censored CSV file generated: " + csvOutputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void censorJsonData(String inputFile, String outputFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayNode matches = (ArrayNode) objectMapper.readTree(new File(inputFile));

        for (JsonNode match : matches) {
            ((ObjectNode) match).put("team1", maskTeamName(match.get("team1").asText()));
            ((ObjectNode) match).put("team2", maskTeamName(match.get("team2").asText()));
            ((ObjectNode) match).put("winner", maskTeamName(match.get("winner").asText()));
            ((ObjectNode) match).put("player_of_match", "REDACTED");

            ObjectNode scoreNode = (ObjectNode) match.get("score");
            Iterator<String> fieldNames = scoreNode.fieldNames();
            ObjectNode newScoreNode = objectMapper.createObjectNode();
            while (fieldNames.hasNext()) {
                String originalKey = fieldNames.next();
                newScoreNode.put(maskTeamName(originalKey), scoreNode.get(originalKey).asInt());
            }
            ((ObjectNode) match).set("score", newScoreNode);
        }

        // Write to output file
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), matches);
    }

    private static void censorCsvData(String inputFile, String outputFile) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode csvData = csvMapper.readerFor(JsonNode.class).with(schema).readTree((DataInput) new File(inputFile));

        ArrayNode modifiedData = objectMapper.createArrayNode();
        for (JsonNode row : csvData) {
            ObjectNode newRow = objectMapper.createObjectNode();
            newRow.put("match_id", row.get("match_id").asInt());
            newRow.put("team1", maskTeamName(row.get("team1").asText()));
            newRow.put("team2", maskTeamName(row.get("team2").asText()));
            newRow.put("score_team1", row.get("score_team1").asInt());
            newRow.put("score_team2", row.get("score_team2").asInt());
            newRow.put("winner", maskTeamName(row.get("winner").asText()));
            newRow.put("player_of_match", "REDACTED");
            modifiedData.add(newRow);
        }

        // Write to new CSV file
        CsvSchema outputSchema = CsvSchema.builder()
                .addColumn("match_id")
                .addColumn("team1")
                .addColumn("team2")
                .addColumn("score_team1")
                .addColumn("score_team2")
                .addColumn("winner")
                .addColumn("player_of_match")
                .setUseHeader(true)
                .build();

        csvMapper.writer(outputSchema).writeValue(new File(outputFile), modifiedData);
    }
    private static String maskTeamName(String teamName) {
        String[] parts = teamName.split(" ", 2);
        return parts.length > 1 ? parts[0] + " ***" : teamName;
    }
}