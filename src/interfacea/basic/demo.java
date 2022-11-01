package interfacea.basic;
//implements实现这个接口
//实现规定的方法
public class demo implements Info{
    public static void main(String[] args) {
        demo d = new demo();
        Computer com = new Computer();
        com.work(d);
    }

    @Override
    public void start() {
        System.out.println("开始工作");
    }

    @Override
    public void end() {
        System.out.println("停止工作");
    }
}
//接口不能被实例化
//所有方法都是public，抽象方法可以不用修饰符
 interface Info{
    //属性只能是final
    //可以包含的的，抽象方法，默认的方法，静态方法
    public int n1 = 10;
    public void start();
    public void end();
    //默认的方法
    default public void ok (){

    }
    //静态的方法
    public static void ha(){

    }
}
class Computer{
    //后面可以接收，实现了接口的类的对象的实例
    public void work(Info info){
        info.start();;
        info.end();
    }
}
