package Thread;

public class deadLock {


}
class DeadLock extends Thread{
    static Object o1= new Object();
    static Object o2= new Object();
    boolean flag;
    public DeadLock(Boolean flag){
        this.flag = flag;
    }
    @Override
    public void run() {
        super.run();
        if(flag){
            synchronized (o1){
                synchronized (o2){}
            }
        }else{
            synchronized (o2){
                synchronized (o1){}
            }
        }
    }
}
