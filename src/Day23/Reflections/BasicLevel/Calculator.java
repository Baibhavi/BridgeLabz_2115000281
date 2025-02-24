package Day23.Reflections.BasicLevel;
import java.lang.reflect.*;
public class Calculator {
    private int multiply(int num1, int num2){
        return num2 * num1;
    }
    public static void main(String[] args) {
        try{
            Calculator calculator = new Calculator();
            Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true);
            int result = (int) method.invoke(calculator, 3, 5);
            System.out.println("Result = " + result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
