package Day1;

import java.util.Scanner;
public class Ques4{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter radius of the circle: ");
			double rad = sc.nextInt();
			double area = 3.14 * (rad * rad);
			System.out.println("Area =  " + area);
			sc.close();
	}
}