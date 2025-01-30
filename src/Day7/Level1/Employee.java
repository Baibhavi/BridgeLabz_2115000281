package Day7.Level1;
import java.util.Scanner;
public class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name, id and salary : ");
        String name = input.nextLine();
        int id = input.nextInt();
        double salary = input.nextDouble();
        Employee employee1 = new Employee(name, id, salary);
        employee1.displayDetails();
    }
    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
}
