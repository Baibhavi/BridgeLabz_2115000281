package Day7.Level1;
import java.util.Scanner;
public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        circle.circleProperties();
    }
    public void circleProperties(){
        double area = 3.14 * radius*radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Area of the circle = " + area);
        System.out.println("Circumference of the circle = " + circumference);
    }
}
