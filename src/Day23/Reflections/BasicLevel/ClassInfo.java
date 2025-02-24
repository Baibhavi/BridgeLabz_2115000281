package Day23.Reflections.BasicLevel;
import java.lang.reflect.*;
import java.util.Scanner;
public class ClassInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter class name : ");
        String className = input.nextLine();
        try{
            Class<?> cls = Class.forName(className);
            System.out.println("Class: " + cls.getName());
            System.out.println("\nFields: ");
            Field[] fields = cls.getDeclaredFields();
            for(Field field: fields){
                System.out.println(field);
            }
            System.out.println("\nConstructors: ");
            Constructor<?>[] constructors = cls.getConstructors();
            for(Constructor<?> constructor : constructors){
                System.out.println(constructor);
            }
            System.out.println("\nMethods: ");
            Method[] methods = cls.getDeclaredMethods();
            for(Method method : methods){
                System.out.println(method);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
