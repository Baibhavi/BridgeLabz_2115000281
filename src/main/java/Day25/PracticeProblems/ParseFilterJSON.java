package Day25.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ParseFilterJSON {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\PracticeProblems\\employee.json"));
            if(jsonNode.isArray()){
                for(JsonNode node : jsonNode){
                    int age = node.get("age").asInt();
                    if(age > 25){
                        System.out.println("Name: " + node.get("name").asText() + ", Age: " + age);
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
