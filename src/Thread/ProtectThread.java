package Thread;

public class ProtectThread {
    public static void main(String[] args) {
        //main线程结束后，子线程自动结束，设置为守护线程
        Demon d= new Demon();
        d.setDaemon(true);
        d.start();
    }
}
class Demon extends Thread {
    @Override
    public void run() {
        super.run();
        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}