package Tank;

import javax.swing.*;

public class TankGame extends JFrame {
    MyPanel panel = null;
    public static void main(String[] args) {
        new TankGame();
    }
    public TankGame(){
        panel = new MyPanel();
        Thread thread = new Thread(panel);
        thread.start();
        //把panel放在面板上
        this.add(panel);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(panel);
    }
}
