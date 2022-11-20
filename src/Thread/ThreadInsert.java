package Thread;

public class ThreadInsert {
    public static void main(String[] args) {
        //yield线程礼让
        //join线程插入
        Thread03 th = new Thread03();
        th.start();
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("主线程"+i);
            if(i==5){
                System.out.println("子线程先执行");
                try {
                    th.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class Thread03 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程"+i);
        }
    }
}
