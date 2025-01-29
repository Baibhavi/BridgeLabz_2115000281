package Day6.Assignment2.ProblemStatements;

import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        if(isPrime(number)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
