package Day23.Annotations.CustomAnnotation.AdvanceLevel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
public class SecureService {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface RoleAllowed {
        String value();
    }
    public static class User {
        private String name;
        private String role;
        public User(String name, String role) {
            this.name = name;
            this.role = role;
        }
        public String getRole() {
            return role;
        }
    }
    public static class AccessControlInterceptor {
        private User user;
        public AccessControlInterceptor(User user) {
            this.user = user;
        }
        public void invokeMethod(Object obj, String methodName) {
            try {
                Method method = obj.getClass().getMethod(methodName);
                if (method.isAnnotationPresent(RoleAllowed.class)) {
                    RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                    if (roleAllowed.value().equals(user.getRole())) {
                        method.invoke(obj);
                    } else {
                        System.out.println("Access Denied!");
                    }
                } else {
                    method.invoke(obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task performed!");
    }
    public static void main(String[] args) {
        User adminUser = new User("Baibhavi", "ADMIN");
        User regularUser = new User("Pooja", "USER");
        SecureService service = new SecureService();
        AccessControlInterceptor adminInterceptor = new AccessControlInterceptor(adminUser);
        AccessControlInterceptor userInterceptor = new AccessControlInterceptor(regularUser);
        adminInterceptor.invokeMethod(service, "performAdminTask"); // Should allow
        userInterceptor.invokeMethod(service, "performAdminTask");  // Should print "Access Denied!"
    }
}
