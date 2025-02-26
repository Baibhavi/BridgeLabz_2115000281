package Day25.HandsOnPracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;

public class ValidateEmails {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode schemaNode = objectMapper.readTree(new File("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\HandsOnPracticeProblems\\email_schema.json"));
            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);
            JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\HandsOnPracticeProblems\\emails.json"));
            ProcessingReport report = schema.validate(jsonNode);
            if (report.isSuccess()) {
                System.out.println("JSON is valid.");
            } else {
                System.out.println("JSON is invalid: " + report);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
