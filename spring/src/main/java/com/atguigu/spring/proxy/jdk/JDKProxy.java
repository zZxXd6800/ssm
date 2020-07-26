package com.atguigu.spring.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author zhuxu
 * @date 2020/7/15 20:58
 */
public class JDKProxy {

    private Object target;

    public JDKProxy(Object target) {
        this.target = target;
    }

    public Object getJDKProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDKProxy: before method invoke ...");
                System.out.println(method.getName() + "::" + Arrays.toString(args));
                Object res = method.invoke(target, args);
                System.out.println("JDKProxy: after method invoke result = " + res);
                return res;
            }
        });
    }
}
