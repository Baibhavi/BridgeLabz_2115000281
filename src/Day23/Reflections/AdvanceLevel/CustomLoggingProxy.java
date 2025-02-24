package Day23.Reflections.AdvanceLevel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
interface Greeting {
    void sayHello(String name);
}
class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
class LoggingInvocationHandler implements InvocationHandler {
    private final Object target;
    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method called: " + method.getName());
        return method.invoke(target, args);
    }
}

public class CustomLoggingProxy {
    public static void main(String[] args) {
        Greeting realGreeting = new GreetingImpl();
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                realGreeting.getClass().getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingInvocationHandler(realGreeting)
        );
        proxyInstance.sayHello("Baibhavi");
    }
}

