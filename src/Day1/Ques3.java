package Day1;

import java.util.Scanner;
public class Ques3{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the temperature in Celsius: ");
			int celsius = sc.nextInt();
			int fahren = (celsius * 9/5) + 32;
			System.out.println("Temperature in Fahrenheit: " + fahren);
			sc.close();
	}
}