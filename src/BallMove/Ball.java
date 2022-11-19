package BallMove;



import javax.swing.*;
import java.awt.*;

public class Ball extends JFrame{
    private MyPanel mp = null;

    public Ball()  {
        this.mp = new MyPanel();
        this.add(mp);
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Ball();
    }
}
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10,10,20,20);
    }
}