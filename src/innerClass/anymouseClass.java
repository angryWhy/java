package innerClass;

public class anymouseClass {
    //匿名内部类，1，本质还是类，2，内部类,3，该类没有名字,4，同时还是一个对象

}
class Outer01{
    private int ha = 1;
    public void say(){
        IA a = new IA() {
            @Override
            public void say() {

            }
        };


        //基于类的匿名内部类
        Father fa = new Father();
        //变编译类型Father
        //运行类型Outer02$01
        //底层创建
        Father father = new Father(){
            @Override
            public void say() {
                System.out.println("哈哈哈");
            }
        };
    }
}
interface IA{
    public void say();
}
class Father{
    public void say(){

    }
    public void cry(){

    }
}