package Day4.Level1;
import java.util.Scanner;
public class PositiveNegativeZero{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numbers:");
		int[] numbers = new int[5];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		for(int i = 0; i < numbers.length; i++){
			int num = numbers[i];
			if(num > 0){
				if(num % 2 == 0){
					System.out.println("Postive Even");
				}
				else{
					System.out.println("Positive Odd");
				}
			}
			else if(num < 0){
				System.out.println("Negative");
			}
			else{
				System.out.println("Zero");
			}
		}
		int first = numbers[0];
		int last = numbers[numbers.length-1];
		if(first == last){
			System.out.println("First and last numbers are equal : " + first);
		}
		else if(first > last){
			System.out.println("First number " + first + " is greater than the last number " + last);
		}
		else{ System.out.println("First number " + first + " is less than the last number " + last);
		}
		input.close();
	}
}
