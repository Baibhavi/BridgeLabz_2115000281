package Day23.Annotations.CustomAnnotation.AdvanceLevel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}
class User {
    @JsonField(name = "user_name")
    private String username;
    @JsonField(name = "user_age")
    private int age;
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
class JsonSerializer {
    public static String toJson(Object object) throws IllegalAccessException {
        Map<String, Object> jsonElements = new HashMap<>();
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jsonField = field.getAnnotation(JsonField.class);
                jsonElements.put(jsonField.name(), field.get(object));
            }
        }
        StringBuilder jsonStringBuilder = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : jsonElements.entrySet()) {
            jsonStringBuilder.append("\"").append(entry.getKey()).append("\": ");
            if (entry.getValue() instanceof String) {
                jsonStringBuilder.append("\"").append(entry.getValue()).append("\"");
            } else {
                jsonStringBuilder.append(entry.getValue());
            }
            jsonStringBuilder.append(", ");
        }
        if (!jsonElements.isEmpty()) {
            jsonStringBuilder.setLength(jsonStringBuilder.length() - 2); // Remove the last comma and space
        }
        jsonStringBuilder.append("}");
        return jsonStringBuilder.toString();
    }
    public static void main(String[] args) {
        User user = new User("JohnDoe", 30);
        try {
            String jsonString = JsonSerializer.toJson(user);
            System.out.println(jsonString);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

