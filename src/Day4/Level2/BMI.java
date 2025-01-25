package Day4.Level2;

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of person: ");
        int numOfPeople = input.nextInt();
        double[] height = new double[numOfPeople];
        double weight[] = new double[numOfPeople];
        for(int i = 0; i < numOfPeople; i++){
            System.out.println("Enter height for person " + (i+1) + " in meters");
            height[i] = input.nextDouble();
            System.out.println("Enter weight for person " + (i+1) + " in kg");
            weight[i] = input.nextDouble();
        }
        double[] bmi = new double[numOfPeople];
        for(int i = 0; i < numOfPeople; i++){
            bmi[i] = weight[i] / (height[i] * height[i]);
        }
        for(int i = 0; i < numOfPeople; i++){
            if(bmi[i] <= 18.4){
                System.out.println("Height of person " + (i+1) + " is " + height[i] + " weight is " + weight[i] + " , BMI is " + bmi[i] + ". So the person is Underweight");
            }
            else if(bmi[i] > 18.4 && bmi[i] <= 24.9){
                System.out.println("Height of person " + (i+1) + " is " + height[i] + " weight is " + weight[i] + " , BMI is " + bmi[i] + ". So the person is Normal");
            }
            else if(bmi[i] > 24.9 && bmi[i] <= 39.9){
                System.out.println("Height of person " + (i+1) + " is " + height[i] + " weight is " + weight[i] + " , BMI is " + bmi[i] + ". So the person is Overweight");
            }
            else{
                System.out.println("Height of person " + (i+1) + " is " + height[i] + " weight is " + weight[i] + " , BMI is " + bmi[i] + ". So the person is Obese");
            }
        }
    }
}
