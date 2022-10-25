package Object;

public class basic {
    public static void main(String[] args){
        //类是抽象的，对象是具体的
        //创建一个对象，赋值给cat
        Cat cat = new Cat();
        cat.name = "哈哈";
        cat.age=20;
        //创建第二个对象
        Cat cat1 = new Cat();
        cat1.name="呵呵";
        System.out.println(cat.name);
        //内存地址赋值
        Cat ccc = cat;
        ccc.name="嘎嘎";
        ccc.sum(20);

        //栈：基本数据类型，堆：对象，数组，方法区：常量池，类加载信息
        //先加载类信息，并且类只会加载一次
        //在堆中分配空间，进行默认初始化（规则），把地址赋值给变量

        //方法调用
        int ha = ccc.reduce();
        //开辟一个空间栈
        //当一个方法执行完毕，或者return，就会返回到调用方法的地方
        //据需执行后面的代码

        //好处
        //提高复用性，实现细节的封装，供其他用户来使用

    }
}
class Cat {
    protected String name;
    int age;
    String[] men;
    //添加一个成员方法
    //public表示方法是公开的
    //void表示方法没有返回值
    //speak表示方法名


    //细节
    //访问修饰符
    //不写，默认访问
    //public
    //protected
    //private私有的
    //一个方法只有一个返回值
    //要求返回，必须return，返回值与返回类型兼容
    //形参和实参必须兼容
    public void speak(){

    }
    public void sum(int n){
        System.out.println(n);
        int ha = reduce();
    }
    //同一个类的方法，直接调用
    public int reduce(){
        return 20;
    }
}
class He{
    public void haha(){
        //跨类调用
        Cat c = new Cat();
        c.speak();
    }
}

