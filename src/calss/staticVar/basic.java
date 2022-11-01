package calss.staticVar;

public class basic {
    //定义一个静态变量，static 静态
    //改变量最大的特点就是会被child类所有对象的实例共享
    public static int count = 0;
    //final
    //修饰类，不能被继承

    public final int age = 22;
    public static void main(String[] args) {
        basic a = new basic();
        System.out.println(a.count);
    }
    //静态方法，访问静态变量
    public final  void say(){
        System.out.println(count);
    }
}
class b extends basic{

}