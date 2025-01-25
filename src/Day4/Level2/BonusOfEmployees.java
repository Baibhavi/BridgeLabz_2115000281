package Day4.Level2;
import java.util.Scanner;
public class BonusOfEmployees {
    public static void main(String[] args) {
        int numberOfEmployess = 10;
        double[] salary = new double[numberOfEmployess];
        double[] yearsOfService = new double[numberOfEmployess];
        double[] bonus = new double[numberOfEmployess];
        double[] newSalary = new double[numberOfEmployess];
        double totalBonus = 0.0, totalOldSalaries = 0.0, totalNewSalaries = 0.0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numberOfEmployess; i++){
            System.out.println("Enter salary of employee "+(i+1)+" :");
            salary[i] = input.nextDouble();
            while(salary[i] <= 0){
                System.out.println("Invalid salary, please enter again for employee" + (i+1) + ": ");
                salary[i] = input.nextDouble();
            }
            System.out.println("Enter years of service for employee " + (i+1) + " :");
            yearsOfService[i] = input.nextDouble();
            while(yearsOfService[i] < 0){
                System.out.println("Invalid years of service, please enter again for employee" + (i+1) + ": ");
                yearsOfService[i] = input.nextDouble();
            }
        }
        for(int i = 0; i < numberOfEmployess; ++i){
            if(yearsOfService[i] > 5){
                bonus[i] = salary[i] * 0.05;
            }
            else{
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalaries += salary[i];
            totalNewSalaries += newSalary[i];
        }
        System.out.println("Total bonus paid: " + totalBonus);
        System.out.println("Total old salary of employees: " + totalOldSalaries);
        System.out.println("Total new salary of employees: " + totalNewSalaries);
    }
}
