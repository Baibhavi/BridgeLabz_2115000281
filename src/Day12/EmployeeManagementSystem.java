package Day12;


abstract class Employee{
    private String employeeId, name;
    private double baseSalary;
    public Employee(String employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId +"\nEmployee Name: " + name + "\nBase Salary: " + baseSalary + "\nTotal Salary: " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee implements Department{
    private double variableSalary;
    private String department;
    public FullTimeEmployee(String employeeId, String name, double baseSalary, double variableSalary){
        super(employeeId, name, baseSalary);
        this.variableSalary = variableSalary;
    }
    public void setVariableSalary(double variableSalary){
        this.variableSalary = variableSalary;
    }
    public double getVariableSalary(){
        return variableSalary;
    }
    @Override
    double calculateSalary() {
        return getBaseSalary() + getVariableSalary();
    }

    @Override
    public void assignDepartment(String department){
        this.department = department;
    }
    public String getDepartmentDetails(){
        return department;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}
class PartTimeEmployee extends Employee implements Department{
    private int workHours;
    private double hourlyRate;
    private String department;
    public PartTimeEmployee(String employeeId, String name,double baseSalary, double hourlyRate, int workHours){
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public void setWorkHours(int workHours){
        this.workHours = workHours;
    }
    public int getWorkHours(){
        return workHours;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }

    @Override
    double calculateSalary() {
        return getHourlyRate() * getWorkHours();
    }
    public void assignDepartment(String department){
        this.department = department;
    }
    public String getDepartmentDetails(){
        return department;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}
interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("FT001", "Baibhavi", 50000, 25000);
        fullTimeEmployee.assignDepartment("Engineering");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("PT001", "Vaishnavi", 0, 500, 25);
        partTimeEmployee.assignDepartment("Sales");
        fullTimeEmployee.displayDetails();
        partTimeEmployee.displayDetails();
    }
}
