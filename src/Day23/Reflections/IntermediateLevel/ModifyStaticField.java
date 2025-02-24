package Day23.Reflections.IntermediateLevel;
import java.lang.reflect.Field;
class Configuration {
    private static String API_KEY = "default_key";
    public static void printApiKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}

public class ModifyStaticField {
    public static void main(String[] args) {
        try {
            Configuration.printApiKey();
            Class<?> configClass = Class.forName("Day23.Reflections.IntermediateLevel.Configuration");
            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);
            apiKeyField.set(null, "new_modified_key");
            Configuration.printApiKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
