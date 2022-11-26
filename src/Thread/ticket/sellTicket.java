package Thread.ticket;

//模拟多线程
public class sellTicket {

    public static void main(String[] args) {

    }
}
class sellTicket01 extends Thread{
    private static int ticketnum = 100;
    //同步方静态的方法，锁为；类本身
    public synchronized static void say(){}
    //public synchronized void sell是一个同步方法，锁在对象身上
    public synchronized void sell(){
        while (true){
            if(ticketnum<=0){
                System.out.println("售票结束");
                return;
            }
            //休眠
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出1张票");
            ticketnum--;
        }
    }
    @Override
    //最简单，给方法上锁，是个同步方法，同一时刻，只有一个线程来操作和执行
    public  void run() {
       sell();
    }
}
