package Reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Properties;

public class basic {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("d:\\a.txt"));
        String className = properties.get("com.Cat").toString();
        String method = properties.get("method").toString();

        //使用反射
        //1.加载类，返回一个Class类型的对象,fullpath
        Class obj = Class.forName(className);

        //2.通过 obj 得到加载类的实例对象
        Object o = obj.newInstance();
        System.out.println(o.getClass());

        //调用方法,得到加载类的对象的method方法,方法也是个对象，在反射中
        Method method1 = obj.getMethod(method);

        //通过method1调用方法，通过方法对象来调用方法
        method1.invoke(obj);
    }
}
