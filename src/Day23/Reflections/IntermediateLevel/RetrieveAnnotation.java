package Day23.Reflections.IntermediateLevel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}
@Author(name = "Baibhavi")
class MyClass {
    public void display() {
        System.out.println("This is MyClass.");
    }
}
public class RetrieveAnnotation {
    public static void main(String[] args) {
        try {
            Class<?> myClass = Class.forName("Day23.Reflections.IntermediateLevel.MyClass");
            if (myClass.isAnnotationPresent(Author.class)) {
                Author authorAnnotation = myClass.getAnnotation(Author.class);
                System.out.println("Author: " + authorAnnotation.name());
            } else {
                System.out.println("No @Author annotation present.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

