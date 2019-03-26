package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author: Administrator
 * Date 2018/12/26 0026 下午 10:08
 */
public class DynamicProxy<T> implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        InvocationHandler proxy = new DynamicProxy(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class<?>[]{Subject.class}, proxy);
        subject.visit();

        InvocationHandler handler = new DynamicProxy<Subject>(new RealSubject());
        Subject o = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, handler);
        o.visit();

    }
}
