package Day4.Level2;
import java.util.Scanner;
public class BMI2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int numOfPeople = input.nextInt();
        double[][] personData = new double[numOfPeople][3];
        String[] weightStatus = new String[numOfPeople];
        for(int i = 0; i < numOfPeople; i++){
            do {
                System.out.println("Enter height for person " + (i+1) + " in cm (positive value):");
                personData[i][0] = input.nextDouble();
                if(personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while(personData[i][0] <= 0);

            do {
                System.out.println("Enter weight for person " + (i+1) + " in kg (positive value):");
                personData[i][1] = input.nextDouble();
                if(personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while(personData[i][1] <= 0);

            double heightInMeters = personData[i][0] / 100;
            personData[i][2] = personData[i][1] / (heightInMeters * heightInMeters);
            if(personData[i][2] <= 18.4){
                weightStatus[i] = "Underweight";
            } else if(personData[i][2] > 18.4 && personData[i][2] <= 24.9){
                weightStatus[i] = "Normal";
            } else if(personData[i][2] > 24.9 && personData[i][2] <= 39.9){
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for(int i = 0; i < numOfPeople; i++){
            System.out.println("Height of person " + (i+1) + " is " + personData[i][0] + " cm, weight is " + personData[i][1] + " kg, BMI is " + personData[i][2] + ". So the person is " + weightStatus[i]);
        }
    }
}

