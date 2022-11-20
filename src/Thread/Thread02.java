package Thread;

public class Thread02  {
    public static void main(String[] args) {
        Cat0 c = new Cat0();
        //不能调用start

        //创建Thread对象，把对象（实现runnable）放进
        Thread thread = new Thread(c);
        thread.start();
    }
}
class Cat0 implements Runnable{

    @Override
    public void run() {

    }
}
