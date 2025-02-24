package Day23.Annotations.CustomAnnotation.BeginnerLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod{
    String level() default "HIGH";
}
public class MarkImportantMethods {
    @ImportantMethod(level = "HIGH")
    public void importantTaskOne() {
        System.out.println("Executing important task one.");
    }
    @ImportantMethod(level = "MEDIUM")
    public void importantTaskTwo() {
        System.out.println("Executing important task two.");
    }
    public void regularTask() {
        System.out.println("Executing regular task.");
    }
    public static void main(String[] args) {
        try{
            Class<?> cls = MarkImportantMethods.class;
            Method[] methods = cls.getDeclaredMethods();
            for(Method method : methods){
                if(method.isAnnotationPresent(ImportantMethod.class)){
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
