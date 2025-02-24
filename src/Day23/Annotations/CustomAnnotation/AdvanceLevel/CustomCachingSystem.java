package Day23.Annotations.CustomAnnotation.AdvanceLevel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}
class Cache {
    private static final Map<String, Object> cacheMap = new HashMap<>();
    public static Object getCachedResult(Method method, Object[] args) {
        String key = generateKey(method, args);
        return cacheMap.get(key);
    }
    public static void cacheResult(Method method, Object[] args, Object result) {
        String key = generateKey(method, args);
        cacheMap.put(key, result);
    }
    private static String generateKey(Method method, Object[] args) {
        StringBuilder keyBuilder = new StringBuilder(method.getName());
        for (Object arg : args) {
            keyBuilder.append(arg.toString()).append("|");
        }
        return keyBuilder.toString();
    }
}
class ExpensiveComputation {
    @CacheResult
    public int compute(int num) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num * num;
    }
}
class CachingInterceptor {
    private final Object target;
    public CachingInterceptor(Object target) {
        this.target = target;
    }
    public Object invoke(Method method, Object[] args) throws Exception {
        if (method.isAnnotationPresent(CacheResult.class)) {
            Object cachedResult = Cache.getCachedResult(method, args);
            if (cachedResult != null) {
                return cachedResult;
            }
        }
        Object result = method.invoke(target, args);
        if (method.isAnnotationPresent(CacheResult.class)) {
            Cache.cacheResult(method, args, result);
        }
        return result;
    }
}
public class CustomCachingSystem {
    public static void main(String[] args) {
        try {
            ExpensiveComputation computation = new ExpensiveComputation();
            CachingInterceptor interceptor = new CachingInterceptor(computation);
            Method method = ExpensiveComputation.class.getMethod("compute", int.class);
            long startTime = System.currentTimeMillis();
            Object result1 = interceptor.invoke(method, new Object[]{5});
            long endTime = System.currentTimeMillis();
            System.out.println("First call result: " + result1 + " (Time: " + (endTime - startTime) + " ms)");
            startTime = System.currentTimeMillis();
            Object result2 = interceptor.invoke(method, new Object[]{5});
            endTime = System.currentTimeMillis();
            System.out.println("Second call result: " + result2 + " (Time: " + (endTime - startTime) + " ms)");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
