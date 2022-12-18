package Reflect;

import java.lang.reflect.Field;

public class Classclass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //class类

        //1.Class是类，也继承自Object类

        //2.Class类对象不是new出来的，而是系统创建的

        //3.对于某个类的Class对象，在内存中只有一份


        //常用方法，Method

        String classAllPath = "Reflect.Car";
        Class cls = Class.forName(classAllPath);
        Object obj = cls.newInstance();
        //显示cls对象，是具体哪个类的对象
        System.out.println(cls);

        //输出运行类型
        System.out.println(cls.getClass());

        //得到包名
        System.out.println(cls.getPackage().getName());

        //得到类名
        System.out.println(cls.getName());

        //创建实例
        Object o = cls.newInstance();

        //通过反射给属性赋值
        Field name = cls.getField("name");
        name.set(obj,"哈哈");

        //所有的属性都可以获取
        Field[] fields = cls.getFields();

    }
}
