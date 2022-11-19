package BallMove;



import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ball extends JFrame {
    private MyPanel mp = null;

    public Ball()  {
        this.mp = new MyPanel();
        this.add(mp);
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(mp);
    }
    public static void main(String[] args) {
        new Ball();
    }
}
//监听键盘发生的事件
class MyPanel extends JPanel implements KeyListener {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10, 10, 20, 20);
    }

    //有字符输出，该方法会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //某个键按下，触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char)e.getKeyCode()+"按下了");
    }
    //某个键释放了，触发 
    @Override
    public void keyReleased(KeyEvent e) {

    }
}