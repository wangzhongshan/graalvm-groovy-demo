package com.wzs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wangzhongshan9
 * @date 2020/8/28
 */
public class App {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        GroovyScript groovyScript = new GroovyScript();
        System.out.println(groovyScript.doCall());

        Class<?> script1Class = Class.forName("com.wzs.script1");
        Object newInstance = script1Class.getConstructor().newInstance();
        Method method = script1Class.getMethod("doCall");
        Object result = method.invoke(newInstance);
        System.out.println(result);
    }
}
