package Day23.Reflections.IntermediateLevel;
import java.lang.reflect.Method;
import java.util.Scanner;
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}
public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            MathOperations mathOperations = new MathOperations();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();
            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            Method method = MathOperations.class.getDeclaredMethod(methodName, int.class, int.class);
            int result = (int) method.invoke(mathOperations, num1, num2);
            System.out.println("Result: " + result);
        }
        catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
