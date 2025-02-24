package Day23.Reflections.AdvanceLevel;

import java.lang.reflect.Field;
import java.util.Map;
class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T object = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, fieldValue);
        }
        return object;
    }
}
class Person {
    private String name;
    private int age;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CustomObjectMapper {
    public static void main(String[] args) {
        try {
            Map<String, Object> properties = Map.of(
                    "name", "Baibhavi",
                    "age", 25
            );
            Person person = ObjectMapper.toObject(Person.class, properties);
            person.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
