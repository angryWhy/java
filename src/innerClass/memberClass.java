package innerClass;

public class memberClass {
    public static void main(String[] args) {
        Outere res = new Outere();
        res.t1();
    }
    //第一种方式
    Outere.Inner in = new Outere().new Inner();
    //外部类名.this.属性
    Outere.Inner in2 = new Outere().obj();

}
class Outere{
    private int age = 22;
    public int count = 10;
    //没有static修饰符，public,private,protected,默认
    //成员内部类，是定义在外部类成员上的,地位就是一个成员
    //作用域就在类体中
    class Inner{
        public void say(){
            System.out.println("外部的"+age+count);
        }
    }
    public void t1(){
        //使用成员内部类
        Inner in = new Inner();
        in.say();
    }
    public Inner obj(){
        return new Inner();
    }
}