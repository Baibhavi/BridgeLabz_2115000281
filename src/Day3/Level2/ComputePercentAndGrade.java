package Day3.Level2;
import java.util.Scanner;
public class ComputePercentAndGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float physics = input.nextFloat();
        float chemistry = input.nextFloat();
        float maths = input.nextFloat();
        float percent = (physics+chemistry+maths)/300 * 100;
        if(percent >= 80){
            System.out.println("Percentage : " + percent + "\nGrade : A" + "\nReamrk : Level 4, above agency-normalized standards" );
        }
        else if(percent >= 70 && percent < 80){
            System.out.println("Percentage : " + percent + "\nGrade : B" + "\nReamrk : Level 3, at agency-normalized standards" );
        }
        else if(percent >= 60 && percent < 70){
            System.out.println("Percentage : " + percent + "\nGrade : C" + "\nReamrk : Level 2, below, but approaching agency-normalized standards" );
        }
        else if(percent >= 50 && percent < 60){
            System.out.println("Percentage : " + percent + "\nGrade : D" + "\nReamrk : Level 1, well below agency-normalized standards" );
        }
        else if(percent >= 40 && percent < 50){
            System.out.println("Percentage : " + percent + "\nGrade : E" + "\nReamrk : Level -1, too below agency-normalized standards" );
        }
        else if(percent < 40){
            System.out.println("Percentage : " + percent + "\nGrade : R" + "\nReamrk : Remedial standards" );
        }
    }
}
