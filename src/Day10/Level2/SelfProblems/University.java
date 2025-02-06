package Day10.Level2.SelfProblems;

import java.util.ArrayList;
import java.util.List;
public class University {
    private String name;
    private List<Department> departments;
    public University(String name){
        this.name = name;
        departments = new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public void deleteUniversity(){
        departments.clear();
        System.out.println("University along with it's departments is deleted");
    }
    public String getName(){
        return name;
    }
    public List<Department> getDepartments(){
        return departments;
    }
    public static void main(String[] args) {
        University university = new University("GLA University");
        Department dept1 = new Department("Engineering");
        Department dept2 = new Department("Management");
        Faculty faculty1 = new Faculty("Dr. Praveen Mittal");
        Faculty faculty2 = new Faculty("Dr. Mayank Srivastava");
        Faculty faculty3 = new Faculty("Dr. Niharika Singh");
        dept1.addFaculty(faculty1);
        dept1.addFaculty(faculty2);
        dept2.addFaculty(faculty3);
        university.addDepartment(dept1);
        university.addDepartment(dept2);
        System.out.println("University : " + university.getName());
        for(Department department : university.getDepartments()){
            System.out.println("Department : " + department.getName());
            for (Faculty faculty : department.getFacultyMembers()){
                System.out.println("Faculty : " + faculty.getName());
            }
        }
        university.deleteUniversity();
        System.out.println("Checking Faculty exists without department or not : "+faculty1.getName());
    }
}
class Department{
    private String name;
    private List<Faculty> facultyMembers;
    public Department(String name){
        this.name = name;
        facultyMembers = new ArrayList<>();
    }
    public void addFaculty(Faculty faculty){
        facultyMembers.add(faculty);
    }
    public String getName(){
        return name;
    }
    public List<Faculty> getFacultyMembers(){
        return facultyMembers;
    }
}
class Faculty{
    private String name;
    public Faculty(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
