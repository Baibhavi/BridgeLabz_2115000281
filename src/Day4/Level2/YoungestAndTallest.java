package Day4.Level2;
import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        for(int i = 0; i < 3; i++){
            if(i == 0){
                System.out.println("Enter age of Amar:");
                age[i] = input.nextInt();
                System.out.println("Enter height of Amar:");
                height[i] = input.nextDouble();
            }
            else if(i == 1){
                System.out.println("Enter age of Akbar:");
                age[i] = input.nextInt();
                System.out.println("Enter height of Akbar:");
                height[i] = input.nextDouble();
            }
            else{
                System.out.println("Enter age of Anthony:");
                age[i] = input.nextInt();
                System.out.println("Enter height of Anthony:");
                height[i] = input.nextDouble();
            }
        }
        if(age[0] < age[1] && age[0] < age[2]){
            System.out.println("Amar is Youngest");
        }
        else if(age[1] < age[0] && age[1] < age[2]){
            System.out.println("Akbar is Youngest");
        }
        else{
            System.out.println("Anthony is Youngest");
        }

        if(height[0] > height[1] && height[0] > height[2]){
            System.out.println("Amar is Tallest");
        }
        else if(height[1] > height[0] && height[1] < height[2]){
            System.out.println("Akbar is Tallest");
        }
        else{
            System.out.println("Anthony is Tallest");
        }
    }
}
