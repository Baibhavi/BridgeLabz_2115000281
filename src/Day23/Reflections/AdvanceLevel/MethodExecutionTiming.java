package Day23.Reflections.AdvanceLevel;

import java.lang.reflect.Method;
class MyClass {
    public void fastMethod() {
        System.out.println("Executing fast method...");
    }
    public void slowMethod() throws InterruptedException {
        System.out.println("Executing slow method...");
        Thread.sleep(2000);
    }
}
public class MethodExecutionTiming {
    public static void measureExecutionTime(Object object, String methodName, Class<?>... parameterTypes) {
        try {
            Method method = object.getClass().getMethod(methodName, parameterTypes);
            long startTime = System.nanoTime();
            method.invoke(object);
            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            System.out.println("Execution time of " + methodName + ": " + executionTime + " nanoseconds");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        measureExecutionTime(myClass, "fastMethod");
        measureExecutionTime(myClass, "slowMethod");
    }
}
