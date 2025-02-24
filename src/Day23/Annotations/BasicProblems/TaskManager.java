package Day23.Annotations.BasicProblems;

import java.lang.reflect.Method;
@interface TaskInfo{
    String priority();
    String assignedTo();
}
public class TaskManager {
    @TaskInfo(priority = "high", assignedTo = "Baibhavi")
    public void criticalTask(){
        System.out.println("This is critical task");
    }
    public static void main(String[] args) {
        try{
            Class<?> taskManagerClass = TaskManager.class;
            Method method = taskManagerClass.getMethod("criticalTask");
            if(method.isAnnotationPresent(TaskInfo.class)){
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
