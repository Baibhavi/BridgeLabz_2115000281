package Day6.Assignment1;

import java.util.Scanner;
public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a strings and character to be removed : ");
        String str = input.nextLine().trim();
        char ch = input.next().charAt(0);
        String result = "";
        for(char i : str.toCharArray()){
            if(i != ch){
                result += i;
            }
        }
        System.out.println("Modified String : " + result);
    }
}
