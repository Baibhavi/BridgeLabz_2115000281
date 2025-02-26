package Day25.HandsOnPracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class PrintKeyAndValuesOfJSON {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\HandsOnPracticeProblems\\Data.json"));
            printKeyValues(jsonNode, "");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void printKeyValues(JsonNode node, String parentKey){
        if(node.isObject()){
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while(fields.hasNext()){
                Map.Entry<String, JsonNode> field = fields.next();
                String fieldKey = parentKey.isEmpty() ? field.getKey() : parentKey + "." + field.getKey();
                printKeyValues(field.getValue(), fieldKey);
            }
        } else if (node.isArray()) {
            int index = 0;
            for(JsonNode element : node){
                printKeyValues(element, parentKey + "[" + index + "]");
                index++;
            }
        }
        else{
            System.out.println(parentKey + ": " + node.asText());
        }
    }
}
