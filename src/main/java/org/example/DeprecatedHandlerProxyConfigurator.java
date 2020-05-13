package org.example;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DeprecatedHandlerProxyConfigurator implements ProxyConfigurator {

    @Override
    public Object replaceWithProxyIfNeeded(Object object, Class implClass) {

        if (!implClass.isAnnotationPresent(Deprecated.class)) {
            return object;
        }

        if (implClass.getInterfaces().length == 0) {
            String message = "--> cglib proxy: Run method with @Deprecated annotation!!!";
            return Enhancer.create(
                    implClass,
                    (InvocationHandler) (proxy, method, args) -> getInvocationHander(object, method, args, message));
        }

        String message = "--> dynamic proxy: Run method with @Deprecated annotation!!!";
        return Proxy.newProxyInstance(
                implClass.getClassLoader(), implClass.getInterfaces(),
                (proxy, method, args) -> getInvocationHander(object, method, args, message));

    }

    private Object getInvocationHander(Object object, Method method, Object[] args, String message)
            throws IllegalAccessException, InvocationTargetException {

        System.out.println(message);
        return method.invoke(object, args);
    }

}
