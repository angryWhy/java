package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class methods {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class lcs = Class.forName("d:\\WORK\\java\\src\\Reflect\\Cat.class");
        Object obj = lcs.newInstance();
        String methodName = "say";
        Method method = lcs.getMethod(methodName);
        method.invoke(obj);

        //得到字段,不能得到私有的属性，通过字段去调用对象来获得具体的值
        Field nameField = lcs.getField("name");
        System.out.println(nameField.get(obj));

        //Constructor，代表类的构造方法
        Constructor constructor = lcs.getConstructor();
        //有多个构造器，如何指定返回
        lcs.getConstructor(String.class);
    }
}
class Cat {
    private String name = "Cat";
    public void say(){

    }
}
