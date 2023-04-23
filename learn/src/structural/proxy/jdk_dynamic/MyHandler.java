package structural.proxy.jdk_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author tianbin
 * @date 2023/4/21
 * @Description
 * @since v1.0.0
 */
public class MyHandler implements InvocationHandler {

    private Object target;

    public MyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start proxy");
        method.invoke(target, args);
        System.out.println("end proxy");
        return null;
    }
}
