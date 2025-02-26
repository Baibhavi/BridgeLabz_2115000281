package Day25.HandsOnPracticeProblems;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeJSONFiles {
    public static void main(String[] args) {
        try{
            String file1 = new String(Files.readAllBytes(Paths.get("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\HandsOnPracticeProblems\\studentInfo1.json")));
            String file2 = new String(Files.readAllBytes(Paths.get("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\main\\java\\Day25\\HandsOnPracticeProblems\\studentInfo2.json")));
            JSONObject json1 = new JSONObject(file1);
            JSONObject json2 = new JSONObject(file2);
            JSONArray peopleArray1 = json1.getJSONArray("people");
            JSONArray peopleArray2 = json2.getJSONArray("people");
            for (int i = 0; i < peopleArray2.length(); i++) {
                peopleArray1.put(peopleArray2.get(i));
            }
            json1.put("people", peopleArray1);
            System.out.println("Merged JSON: " + json1.toString(4));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
