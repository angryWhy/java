package generic;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        ArrayList<Dog> arr = new ArrayList<Dog>();
        arr.add(new Dog("东",22));
        for(Dog o : arr){
            o.getAge();
        }
        HashSet<Student> stu = new HashSet<Student>();
        stu.add(new Student());
        HashMap<String,Student> m = new HashMap<String,Student>();
        Set<Map.Entry<String,Student>> en = m.entrySet();
        Iterator<Map.Entry<String,Student>> it = en.iterator();


        //细节不能传入基本数据类型，只能是引用类型
        //给泛型传入类型，可以传入该类型或者子类型
        //简写
        ArrayList<Object> a = new ArrayList<Object>();
        a.add(new Dog("1",2));
        ArrayList<Integer> a2 = new ArrayList<>();


        //泛型标识符可以有多个
        //普通成员可以有泛型（属性和方法）
        //使用泛型数组，不能初始化
        //
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//声明一个类的某个属性的类型
//方法的返回值
class Cat<T>{
    T name;
    public Cat(T name){
        this.name = name;
    }
    public T getName(){
        return name;
    }
}
class Student{
    private String name;
    private int age;
    public void run(){

    }
    //泛型方法
    //<T,R>就是泛型
    //调用时候确定类型
    public <T,R> void fly(T A,R B){

    }
}