package Reflect;

public class getClass {
    public static void main(String[] args) throws ClassNotFoundException {

        //多用于配置文件，读取类全路径，记载类
        //通过配置文件夺取
        String classPath = "Reflect.Car";
        Class cls = Class.forName(classPath);

        //类名.class
        //多用于参数传递，通过反射获取到的构造器对象
        Class<Car> carClass = Car.class;

        //通过过创建好的对象，获取class
        Car car = new Car();
        Class cls2 = car.getClass();

        //通过加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class aClass = classLoader.loadClass(classPath);

        //基本数据类型
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;

        //基本数据类型的包装类.TYPE
        Class<Integer> type = Integer.TYPE;

    }
}
