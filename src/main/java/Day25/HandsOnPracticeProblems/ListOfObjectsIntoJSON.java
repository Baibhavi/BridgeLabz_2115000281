package Day25.HandsOnPracticeProblems;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

class StudentDetail{
    public int id;
    public String name;
    public StudentDetail(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class ListOfObjectsIntoJSON {
    public static void main(String[] args) {
        StudentDetail student1 = new StudentDetail(1, "Baibhavi");
        StudentDetail student2 = new StudentDetail(2, "Krishna");
        StudentDetail student3 = new StudentDetail(3, "Palak");
        List<StudentDetail> studentDetails = new ArrayList<>();
        studentDetails.add(student1);
        studentDetails.add(student2);
        studentDetails.add(student3);
        Gson gson = new Gson();
        String json = gson.toJson(studentDetails);
        System.out.println(json);
    }
}
