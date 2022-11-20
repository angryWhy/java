package Thread;

public class ThreadMethods {
    public static void main(String[] args) {
        TE t = new TE();
        t.setName("线程名字");
        t.setPriority(Thread.MIN_PRIORITY);
        //启动子线程
        t.start();
        t.getName();
    }
}
class TE extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("休眠中---");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            //当线程中断休眠，可以调用interrupt
            //捕获到一个中断异常
            throw new RuntimeException(e);
        }
    }
}