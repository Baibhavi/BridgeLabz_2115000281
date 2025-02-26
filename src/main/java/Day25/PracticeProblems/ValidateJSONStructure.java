package Day25.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;

public class ValidateJSONStructure {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            File schemaFile = new File("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\PracticeProblems\\schema.json");
            File jsonFile = new File("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\PracticeProblems\\students.json");
            JsonNode schemaNode = objectMapper.readTree(schemaFile);
            JsonSchemaFactory factory =  JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);
            JsonNode jsonNode = objectMapper.readTree(jsonFile);
            ProcessingReport report = schema.validate(jsonNode);
            if(report.isSuccess()){
                System.out.println("JSON is valid");
            }
            else {
                System.out.println("JSON is invalid: " + report);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
