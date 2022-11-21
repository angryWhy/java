package Thread;

public class ThreadStatus {
    public static void main(String[] args) {
        T t = new T();
        //创建之后是NEW状态
        System.out.println(t.getState());
        t.start();
        //start之后就是runable状态
        while(t.getState()!=Thread.State.TERMINATED){
            System.out.println(t.getState());
        }
        System.out.println(t.getState());
    }
}
class T extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("1111");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}