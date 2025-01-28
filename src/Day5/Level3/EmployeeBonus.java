package Day5.Level3;
import java.util.Random;
public class EmployeeBonus {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] updatedEmployeeData = calculateNewSalaryAndBonus(employeeData);
        displayData(employeeData, updatedEmployeeData);
    }

    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 50000 + rand.nextInt(50000);
            data[i][1] = rand.nextInt(10);
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        double[][] updatedData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double oldSalary = data[i][0];
            int yearsOfService = data[i][1];
            double bonusRate = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    public static void displayData(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-12s%-15s%-15s%-15s\n", "Employee", "Old Salary", "New Salary", "Bonus");
        for (int i = 0; i < 10; i++) {
            totalOldSalary += newData[i][0];
            totalNewSalary += newData[i][1];
            totalBonus += newData[i][2];
            System.out.printf("%-12d%-15.2f%-15.2f%-15.2f\n", (i + 1), newData[i][0], newData[i][1], newData[i][2]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }
}
