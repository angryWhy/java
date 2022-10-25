package Object;

public class varScope {

}
class Demo{
    //全局变量，也就是在整个类有效，可以不赋值，有默认值
    //局部变量：除了属性之外，必须先声明后赋值
    int gae = 10;
    //访问修饰符，全局可以加，局部不可以加
    public int ag = 10;
    private char s = 'c';

    public void say(){
        //局部变量,就在say作用域
        int n = 2;
        String a = "1";
    }
}
