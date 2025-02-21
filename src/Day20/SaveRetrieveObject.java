package Day20;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Employee implements Serializable{
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + '}';
    }
}
public class SaveRetrieveObject {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(1, "Baibhavi", "Engineering",30000));
        employeesList.add(new Employee(2, "Pooja", "Management",40000));
        employeesList.add(new Employee(1, "Divya", "Engineering",30000));
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\employees.ser"))){
            oos.writeObject(employeesList);
            System.out.println("Employees have been serialized to employees.ser");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\BridgeLabs_Asssignments\\src\\Day20\\employees.ser"))){
            List<Employee> employees = (List<Employee>) ois.readObject();
            for(Employee employee : employees){
                System.out.println(employee);
            }
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
