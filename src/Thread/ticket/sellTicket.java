package Thread.ticket;

//模拟多线程
public class sellTicket {

    public static void main(String[] args) {

    }
}
class sellTicket01 extends Thread{
    private static int ticketnum = 100;
    @Override
    public void run() {
        while (true){
            if(ticketnum<=0){
                System.out.println("售票结束");
                break;
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
}
