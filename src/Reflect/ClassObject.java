package Reflect;

import java.io.Serializable;

public class ClassObject {
    public static void main(String[] args) {
        //具有Class对象
        //外部类，成员内部类，静态内部类，局部内部类，匿名内部类
        //接口
        //数组
        //枚举
        //朱姐
        //基本数据类型
        //void
        Class<String> stringClass = String.class;//外部类
        Class<Serializable> serializableClass = Serializable.class;//接口
        Class<Integer[]> aClass = Integer[].class;
        Class<float[][]> aClass1 = float[][].class;
        Class<Deprecated> deprecatedClass = Deprecated.class;

    }
}
