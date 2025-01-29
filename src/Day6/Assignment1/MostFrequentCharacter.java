package Day6.Assignment1;

import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a strings : ");
        String str = input.nextLine().trim();
        char mostFreq = 'i';
        int maxCount = 0;
        for(int i = 0; i < str.length() ; i++){
            int count = 0;
            for(int j = i; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > maxCount){
                mostFreq = str.charAt(i);
                maxCount = count;
            }
        }
        System.out.println("Most frequent character is " + mostFreq);
    }
}
