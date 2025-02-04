package Day9.Level1;

public class Employee {
    private static String companyName = "Capgemini";
    private static int totalEmployees = 0;
    private String name, designation;
    private final int id;
    public Employee(String name, String designation, int id){
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }
    public static void displayTotalEmployees(){
        System.out.println("Total Employees : "+totalEmployees);
    }
    public void displayEmployeeDetail(){
        if(this instanceof Employee){
            System.out.println("Company : " + companyName);
            System.out.println("Employee Name : " + this.name);
            System.out.println("Designation : " + this.designation);
            System.out.println("Employee ID : " + this.id);
            System.out.print("\n-----------------------------------------------------------------------------------------------\n");
        }
        else{
            System.out.println("Invalid Request");
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Pooja" , "A4 Analyst", 213);
        Employee employee2 = new Employee("Mayank" , "Analyst*", 264);
        Employee employee3 = new Employee("Baibhavi" , "A4 Analyst", 212);
        employee1.displayEmployeeDetail();
        employee2.displayEmployeeDetail();
        displayTotalEmployees();
    }
}
