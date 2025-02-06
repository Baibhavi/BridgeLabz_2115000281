package Day11.IntroductionOfInheritance.EmployeeManagementSystem;

public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Employee Name: " + name + ", EmployeeID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Pooja", 234, 425000);
        Manager manager = new Manager("Aman", 321, 760000, 10);
        Developer developer = new Developer("Baibhavi", 387, 450000, "Java");
        Intern intern = new Intern("John", 143, 10000, 3);
        employee.displayDetails();
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    public void displayDetails(){
        System.out.println("Manager Name: " + name + ", EmployeeID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void displayDetails(){
        System.out.println("Developer Name: " + name + ", EmployeeID: " + id + ", Salary: " + salary + ", Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee{
    int internshipMonths;
    public Intern(String name, int id, double salary, int internshipMonths){
        super(name, id, salary);
        this.internshipMonths = internshipMonths;
    }
    public void displayDetails(){
        System.out.println("Intern Name: " + name + ", EmployeeID: " + id + ", Salary: " + salary + ", Internship Months: " + internshipMonths);
    }
}

