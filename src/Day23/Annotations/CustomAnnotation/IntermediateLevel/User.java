package Day23.Annotations.CustomAnnotation.IntermediateLevel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}
public class User {
    @MaxLength(10)
    private String username;
    public User(String username) {
        this.username = username;
        validateUsernameLength();
    }
    private void validateUsernameLength() {
        try {
            Class<?> cls = this.getClass();
            Field field = cls.getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (username.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username exceeds the maximum length of " + maxLength.value() + " characters");
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            User user = new User("VeryLongUsername");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            User user = new User("ShortName");
            System.out.println("Username set successfully: " + user.username);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
