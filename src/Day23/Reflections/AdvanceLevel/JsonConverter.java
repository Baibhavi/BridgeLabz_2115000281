package Day23.Reflections.AdvanceLevel;

import java.lang.reflect.Field;
class JsonMapper {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder jsonBuilder = new StringBuilder();
        Class<?> clazz = obj.getClass();
        jsonBuilder.append("{");
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = field.get(obj);
            jsonBuilder.append("\"").append(fieldName).append("\": ");
            if (fieldValue instanceof String) {
                jsonBuilder.append("\"").append(fieldValue).append("\"");
            } else {
                jsonBuilder.append(fieldValue);
            }
            if (i < fields.length - 1) {
                jsonBuilder.append(", ");
            }
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
class Person1 {
    private String name;
    private int age;
    private boolean student;
    public Person1(String name, int age, boolean student) {
        this.name = name;
        this.age = age;
        this.student = student;
    }
}

public class JsonConverter {
    public static void main(String[] args) {
        try {
            Person1 person = new Person1("Baibhavi", 25, true);
            String jsonString = JsonMapper.toJson(person);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
