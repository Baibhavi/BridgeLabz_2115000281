package Day1;

import java.util.Scanner;
public class Ques5{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter radius and height of the cylinder: ");
			double radius = sc.nextInt();
			double height = sc.nextInt();
			double volume = 3.14 * (radius * radius) * height;
			System.out.println("Volume =  " + volume);
			sc.close();
	}
}