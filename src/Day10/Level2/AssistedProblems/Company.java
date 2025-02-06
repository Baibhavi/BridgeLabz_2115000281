package Day10.Level2.AssistedProblems;

import java.util.ArrayList;
import java.util.List;
public class Company {
    private String name;
    private List<Department> departments;
    public Company(String name){
        this.name = name;
        departments = new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public String getName(){
        return name;
    }
    public List<Department> getDepartments() {
        return departments;
    }
    public void deleteCompany(){
        departments.clear();
        System.out.println("Company and all its departments and employees have been deleted.");
    }
}
class Department{
    private String name;
    private List<Employee> employees;
    public Department(String name){
        this.name = name;
        employees = new ArrayList<>();
    }
    public void addEmployees(Employee employee){
        employees.add(employee);
    }
    public String getName(){
        return name;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}
class Employee{
    private String name;
    private int id;
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
}
class Main3{
    public static void main(String[] args) {
        Company company = new Company("Capgemini");
        Department dept1 = new Department("Marketing");
        Department dept2 = new Department("IT");
        Employee employee1 = new Employee("Baibhavi", 281);
        Employee employee2 = new Employee("Pooja", 687);
        Employee employee3 = new Employee("Divya", 435);
        dept1.addEmployees(employee2);
        dept2.addEmployees(employee1);
        dept2.addEmployees(employee3);
        company.addDepartment(dept1);
        company.addDepartment(dept2);
        System.out.println("Company : " + company.getName());
        for(Department department : company.getDepartments()){
            System.out.println("Department : " + department.getName());
            for(Employee employee : department.getEmployees()) {
                System.out.println("Employee : " + employee.getName());
            }
        }
        company.deleteCompany();
    }
}
