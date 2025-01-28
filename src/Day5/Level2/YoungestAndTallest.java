package Day5.Level2;

import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        float[] height = new float[3];
        for(int i = 0; i < 3; i++){
            if( (i+1) == 1){
                System.out.println("Enter age and height of Amar : ");
                age[i] = input.nextInt();
                height[i] = input.nextFloat();
            }
            else if( (i+1) == 2){
                System.out.println("Enter age and height of Akabr : ");
                age[i] = input.nextInt();
                height[i] = input.nextFloat();
            }
            else{
                System.out.println("Enter age and height of Anthony : ");
                age[i] = input.nextInt();
                height[i] = input.nextFloat();
            }
        }
        findYoungest(age);
        findTallest(height);
    }
    public static void findYoungest(int[] age){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i : age){
            if(i < min){
                min = i;
                index++;
            }
        }
        if(index == 1){
            System.out.println("Amar is Youngest with age " + min);
        }
        else if(index == 2){
            System.out.println("Akbar is Youngest with age " + min);
        }
        else{
            System.out.println("Anthony is Youngest with age " + min);
        }
    }
    public static void findTallest(float[] height){
        float max = Float.MIN_VALUE;
        int index = 0;
        for(float i : height){
            if(i > max){
                max = i;
                index++;
            }
        }
        if(index == 1){
            System.out.println("Amar is Tallest with height " + max);
        }
        else if(index == 2){
            System.out.println("Akbar is Tallest with height " + max);
        }
        else{
            System.out.println("Anthony is Tallest with height " + max);
        }
    }
}
