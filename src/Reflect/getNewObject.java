package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getNewObject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //1.获取到User类的Class对象
        Class<?> aClass = Class.forName("Reflect.Obj");
        //通过无参构造创建
        Object o = aClass.newInstance();
        //2.有参构造,也就代表Obj(String param)
        Constructor<?> constructor = aClass.getConstructor(String.class);
        constructor.newInstance("hahah");
        //3.非public的有参构造器
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class);
        //私有的非法访问异常，爆破
        declaredConstructor.setAccessible(true);
        Object o1 = constructor.newInstance(100, 200);



        //访问属性
        //获取
        Field f = aClass.getField("name");
        //爆破
        f.setAccessible(true);
        //访问或者设置
        f.set(o1,"value");
        //既往太属性，泽set和get
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o1,"新的值");
        //如果静态属性，那么对象是null


        //访问方法
        Class cls2 = Class.forName("Reflect.Dog");
        Object o2 = cls2.newInstance();
        Method say = cls2.getMethod("say");
        say.invoke(o2,"我是参数");

        //得到非public对象
        Method say2 = cls2.getDeclaredMethod("say",String.class);
        say2.invoke(o2,"哈哈");

        //私有的情况
        say2.setAccessible(true);
    }
}
class Obj{

}