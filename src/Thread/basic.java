package Thread;

public class basic {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //启动线程,main线程启动一个子线程，Thread-0，主线程不会阻塞
        cat.start();
        //为什么不调用run方法，cat.run，就是主线程调用。普通方法，没有开线程，run执行完毕，才会执行下一个
    }
}
//当一个类继承Thread类，该类可以当做线程来使用
//重写run方法，写上自己的业务代码
//run Thread类 实现了Runnable接口的run方法
class Cat extends Thread {
    @Override
    public void run() {
        super.run();
        //每隔一秒输出,Thread-0
        System.out.println("线程"+Thread.currentThread().getName());
        //休眠1秒
        //alt + ctrl + t
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}