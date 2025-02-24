package Day23.Annotations.CustomAnnotation.IntermediateLevel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
    String message() default "Method executed in: ";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Authors {
    String[] names();
    int version() default 1;
}
@Authors(names = {"Baibhavi", "Vaishnavi"}, version = 2)
public class LoggingMethodExecutionTime {
    @LogExecutionTime(message = "Time taken: ")
    public void processData() {
        for (int i = 0; i < 1000000; i++) {
            int temp = i * i; // Simulate some processing
        }
        System.out.println("Processing data...");
    }

    @LogExecutionTime
    public void performTask() {
        for (int i = 0; i < 500000; i++) {
            int temp = i + i; // Simulate some task
        }
        System.out.println("Performing task...");
    }

    public static void main(String[] args) {
        LoggingMethodExecutionTime service = new LoggingMethodExecutionTime();
        service.runAnnotatedMethods();
    }

    public void runAnnotatedMethods() {
        Method[] methods = this.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
                try {
                    long startTime = System.nanoTime();
                    method.invoke(this);
                    long endTime = System.nanoTime();
                    System.out.println(annotation.message() + (endTime - startTime) / 1_000_000 + " ms");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
