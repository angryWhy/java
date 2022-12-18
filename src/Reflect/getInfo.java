package Reflect;

public class getInfo {
    public static void main(String[] args) {
        //1.getName获取全类名

        //2.getSimpleName获取简单类名

        //3.getFields：获取所有public修饰的属性，包含本类以及父类

        //4.getDeclaredFields：获取别类的所有属性

        //5.getMethods：获取所有包含父类的方法（public）

        //6.getDeclaredMethods：获取所有的方法

        //7.getConstructors：获取所有public修饰的构造器

        //8.getDeclaredConstructors：获取本类的所有构造器

        //9.getPackage：以包形式，返回类的信息

        //10.getSuperClass：以class形式返回父类信息

        //11.getInterfaceClass：以class[] 返回接口信息

        //12、getAnnotations： 返回Annotations[]形式注解信息


        //1.Field类
        //getModifiers：以int形式返回修饰符：默认是0，public 1，private 2，protected 4，static 8 ，finial 16
        //getType：以calss形式返回类型
        //getName：返回属性名


        //2.Method类
        //getModifiers,以int形式返回修饰符：默认是0，public 1，private 2，protected 4，static 8 ，finial 16
        //getReturnType,以class形式获取返回类型
        //getName：返回方法名
        //getParameterTypes：以Class[]返回参数类型数组
    }
}
