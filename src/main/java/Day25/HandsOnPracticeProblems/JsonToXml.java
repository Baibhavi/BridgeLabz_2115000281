package Day25.HandsOnPracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXml {
    public static void main(String[] args) {
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\HandsOnPracticeProblems\\people.json")));
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonContent);
            XmlMapper xmlMapper = new XmlMapper();
            String xmlContent = xmlMapper.writeValueAsString(jsonNode);
            System.out.println("Converted XML: \n" + xmlContent);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
