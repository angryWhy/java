package Thread;

public class exercise02 {
    public static void main(String[] args) {

    }
}
class User implements Runnable {
    private int money = 1000;
    @Override
    public void run() {
        while (true){
            //实现线程同步
            //this对象锁，是非公平锁
            synchronized (this){
                if(money<1000){
                    System.out.println(Thread.currentThread().getName()+money);
                    break;
                }
                money -= 1000;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
