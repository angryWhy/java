package Thread;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
    }
}
class A extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        super.run();
        while (loop){
            System.out.println((int)Math.random()*100+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class B extends Thread{
    private A a;
    private Scanner in = new Scanner(System.in);
    public B(A a){
        this.a = a;
    }
    @Override
    public void run() {
        super.run();
        while(true){
            System.out.println("输入Q退出:");
            char key = in.next().toUpperCase().charAt(0);
            if(key =='Q'){
                a.setLoop(false);
                break;
            }
        }
    }
}
