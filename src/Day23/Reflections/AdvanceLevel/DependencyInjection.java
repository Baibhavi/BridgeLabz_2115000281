package Day23.Reflections.AdvanceLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}
class DatabaseService {
    public void connect() {
        System.out.println("Connected to the database.");
    }
}
class NotificationService {
    public void sendNotification() {
        System.out.println("Notification sent.");
    }
}
class UserService {
    @Inject
    private DatabaseService databaseService;
    @Inject
    private NotificationService notificationService;
    public void performAction() {
        databaseService.connect();
        notificationService.sendNotification();
    }
}
class DIContainer {
    private Map<Class<?>, Object> instanceCache = new HashMap<>();
    public <T> T getInstance(Class<T> clazz) throws Exception {
        if (instanceCache.containsKey(clazz)) {
            return clazz.cast(instanceCache.get(clazz));
        }
        T instance = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = getInstance(fieldType);
                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }
        instanceCache.put(clazz, instance);
        return instance;
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
        try {
            DIContainer container = new DIContainer();
            UserService userService = container.getInstance(UserService.class);
            userService.performAction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

