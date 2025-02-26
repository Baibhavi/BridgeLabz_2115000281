package Day25.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
class Student{
    public String name;
    public int age;
    public String[] subjects;
    public Student(String name, int age, String[] subjects){
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }
}
public class CreateJSONObjects {
    public static void main(String[] args) {
        JSONObject studentObject = new JSONObject();
        studentObject.put("name", "Baibhavi");
        studentObject.put("age", 22);
        studentObject.put("subjects", new JSONArray().put("English").put("Maths").put("Science").put("Social Studies").put("Hindi"));
        System.out.println(studentObject);
        JsonObject studentObject2 = new JsonObject();
        studentObject2.addProperty("name", "Pooja");
        studentObject2.addProperty("age", 21);
        JsonArray subjectArray = new JsonArray();
        subjectArray.add("English");
        subjectArray.add("Maths");
        subjectArray.add("Science");
        subjectArray.add("Social Science");
        subjectArray.add("Hindi");
        studentObject2.add("subjects", subjectArray);
        System.out.println(studentObject2);
        try{
            ObjectMapper studentMapper = new ObjectMapper();
            Student student = new Student("Krishna", 22, new String[]{"English", "Hindi", "Maths", "Science"});
            String jsonString = studentMapper.writeValueAsString(student);
            System.out.println(jsonString);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
