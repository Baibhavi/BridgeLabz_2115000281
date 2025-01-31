package Day8.Level1;

public class Circle {
    private double radius;
    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Default Circle Radius: " + circle.getRadius());
        Circle circle2 = new Circle(5.0);
        System.out.println("Default Circle Radius: " + circle2.getRadius());
        Circle circle3 = new Circle();
        circle3.setRadius(6.5);
        System.out.println("Default Circle Radius: " + circle3.getRadius());
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
