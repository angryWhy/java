package calss.staticVar.abstractcl;

public class basic {
    public static void main(String[] args) {
         son s = new son();
         s.caluate();
    }
}
//抽象类不可实例化
//类包含了abstract方法，必须声明abstract类
//继承了，必须实现所有的抽象方法
abstract class fater{
    public abstract void job();
    //抽象类可以没有abstract方法


    public void caluate() {
        long time = System.currentTimeMillis();
        job();
        long time2 = System.currentTimeMillis();
        System.out.println("任务执行时间："+(time2-time));
    }
}
class son extends fater{

    @Override
    public void job() {
        for(int i = 0;i<1000000;i++){

        }
    }
}


