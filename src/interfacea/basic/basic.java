package interfacea.basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


public class basic {
    public static void main(String[] args) {
        timer t = new timer();
        Timer t1 = new Timer(1000,t);
        t1.start();
    }
}
class timer implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
