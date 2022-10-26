package Object;

public class constructor {
    //构造器修饰符可以是默认，public
    //没有返回值
    //和类名一样
    //构造器的调用由系统完成
    //对象初始化
    public static void main(String[] args){
        Person a = new Person("哈哈",20);
    }
}
//构造器流程
//加载Person类信息
//堆分配空间
//对象初始化，默认初始化，显示初始化，构造器
class Person{
    String name;
    int age;
    //无返回值
    //和类名一样


    //构造器的name是局部变量，不是属性

    public Person(String name,int age){
        //自己给自己赋值了一遍
        name = name;
        //变量名和属性一样，希望给属性赋值
        this.age = age;
    }
    //多个构造器
    public Person(String name){
        name = name;
    }

    //没有构造器，生成默认构造器
    //定义了构造器，默认就会被覆盖
    Person(){}
}
