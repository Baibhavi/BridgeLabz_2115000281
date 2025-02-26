package Day25.HandsOnPracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CsvToJson {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\HandsOnPracticeProblems\\dataset.csv";
        try{
            List<Map<String, String>> jsonData = readCSVToJSON(csvFile);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonOutput = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonData);
            System.out.println("Converted JSON: \n" + jsonOutput);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Map<String, String>> readCSVToJSON(String csvFilePath) throws IOException, CsvValidationException{
        List<Map<String, String>> jsonData = new ArrayList<>();
        try(CSVReader cr = new CSVReader(new FileReader(csvFilePath))){
            String[] header = cr.readNext();
            String[] row;
            while((row = cr.readNext()) != null){
                Map<String, String> map = new LinkedHashMap<>();
                for(int i = 0; i < header.length; i++){
                    map.put(header[i], row[i]);
                }
                jsonData.add(map);
            }
        }
        return jsonData;
    }
}
