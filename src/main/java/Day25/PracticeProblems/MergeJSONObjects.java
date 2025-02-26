package Day25.PracticeProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class MergeJSONObjects {
    public static void main(String[] args) {
        JSONObject studentInfo1 = new JSONObject();
        studentInfo1.put("name", "Baibhavi");
        studentInfo1.put("age", 22);
        JSONObject studentInfo2 = new JSONObject();
        studentInfo2.put("subjects", new JSONArray().put("DBMS").put("Java").put("OS"));
        for(String key : studentInfo2.keySet()){
            studentInfo1.put(key, studentInfo2.get(key));
        }
        System.out.println(studentInfo1);
    }
}
