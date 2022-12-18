package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testReflect {
    public static void main(String[] args) {

    }
    public void m1(){
        Cat c = new Cat();
        long start = System.currentTimeMillis();
        for(int i = 0;i<9999999;i++){
            c.say();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法来调用hi 耗时="+(end-start));
    }

    public void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName(" ");
        Object obj = cls.newInstance();
        Method method = cls.getMethod("hi");

        //反射调用优化，关闭访问检查
        method.setAccessible(true);
        long start = System.currentTimeMillis();
        for(int i = 0;i<9999999;i++){
            method.invoke(obj);
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法来调用hi 耗时="+(end-start));
    }

}
class Dog{
    public void say(){

    }
}