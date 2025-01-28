package Day5.Level2;

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] weightHeight = new double[10][3];
        for(int i = 0; i < weightHeight.length; i++){
            System.out.println("Enter weight in kg and height in cm for person " + (i+1) + " respectively");
            weightHeight[i][0] = input.nextDouble();
            weightHeight[i][1] = input.nextDouble();
            double heightMeter = weightHeight[i][1] / 100;
            weightHeight[i][2] = weightHeight[i][0] / Math.pow(heightMeter, 2);
        }
         bmiStatus(weightHeight);
    }
    public static void bmiStatus(double[][] bmiData){
        for(int i = 0; i < bmiData.length; i++){
            if(bmiData[i][2] <= 18.4){
                System.out.println("Person " + (i+1) + " with weight " + bmiData[i][0] + " kg and height " + bmiData[i][1] + " cm is Underweight");
            }
            else if(bmiData[i][2] >= 18.5 && bmiData[i][2] <= 24.9){
                System.out.println("Person " + (i+1) + " with weight " + bmiData[i][0] + " kg and height " + bmiData[i][1] + " cm is Normal");
            }
            else if(bmiData[i][2] >= 25.0 && bmiData[i][2] <= 39.9){
                System.out.println("Person " + (i+1) + " with weight " + bmiData[i][0] + " kg and height " + bmiData[i][1] + " cm is Overweight");
            }
            else{
                System.out.println("Person " + (i+1) + " with weight " + bmiData[i][0] + " kg and height " + bmiData[i][1] + " cm is Obese");
            }
        }
    }
}
