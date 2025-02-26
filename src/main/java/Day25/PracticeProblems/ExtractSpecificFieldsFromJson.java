package Day25.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ExtractSpecificFieldsFromJson {
    public static void main(String[] args) {
        String jsonFile = "C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\PracticeProblems\\students.json";
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootArray = objectMapper.readTree(new File(jsonFile));
            if(rootArray.isArray()){
                for(JsonNode studentNode : rootArray){
                    String name = studentNode.get("name").asText();
                    String email = studentNode.get("email").asText();
                    System.out.println("Name: " + name + ", Email: " + email);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
