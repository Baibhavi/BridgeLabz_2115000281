package Day23.Annotations.CustomAnnotation.BeginnerLevel;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface Todo{
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
public class PendingTasks {
    @Todo(task = "user authentication", assignedTo = "Baibhavi", priority = "HIGH")
    public void userAuthentication(){
        System.out.println("Authorising");
    }
    @Todo(task = "notifying user about email", assignedTo = "Pooja")
    public void emailNotification(){
        System.out.println("New Email Received");
    }
    @Todo(task = "Optimize database queries", assignedTo = "Krishna", priority = "LOW")
    public void optimizeDatabase() {
        System.out.println("Executing optimize database task.");
    }

    public static void main(String[] args) {
        try{
            Class<?> cls = PendingTasks.class;
            Method[] methods = cls.getDeclaredMethods();
            for(Method method : methods){
                if(method.isAnnotationPresent(Todo.class)){
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println("Method: " + method.getName() + ", Task: " + todo.task() + ",Assigned To: " + todo.assignedTo() + ", Priority: " + todo.priority());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
