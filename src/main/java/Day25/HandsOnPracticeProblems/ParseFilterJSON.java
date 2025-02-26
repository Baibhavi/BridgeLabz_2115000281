package Day25.HandsOnPracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ParseFilterJSON {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\HandsOnPracticeProblems\\users.json"));
            if(jsonNode.isArray()){
                boolean found = false;
                System.out.print("Users older than 25 years of age: ");
                for(JsonNode user : jsonNode){
                    int age = user.get("age").asInt();
                    if(age > 25){
                        found = true;
                        System.out.print("\n" + user);
                    }
                }
                if(!found){
                    System.out.println("Not found");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
