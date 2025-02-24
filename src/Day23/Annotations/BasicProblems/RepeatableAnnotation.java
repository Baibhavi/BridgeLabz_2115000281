package Day23.Annotations.BasicProblems;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport{
    String description();
}
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports{
    BugReport[] value();
}
public class RepeatableAnnotation {
    @BugReport(description = "Null Pointer Exception")
    @BugReport(description = "Array index out of bound")
    public void repeatableTask(){}
    public static void main(String[] args) {
        try{
            Class<?> repeatableClass = RepeatableAnnotation.class;
            Method method = repeatableClass.getMethod("repeatableTask");
            if(method.isAnnotationPresent(BugReports.class)){
                BugReports bugReports = method.getAnnotation(BugReports.class);
                for(BugReport bugs : bugReports.value()){
                    System.out.println("Bug Report: " + bugs.description());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
