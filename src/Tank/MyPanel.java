package Tank;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    //定义我的坦克
    MyTank hero = null;
    public MyPanel(){
        //初始化我的Tank
        hero = new MyTank(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //填充矩形
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(), hero.getY(),g,0, 0);
    }
    //画tank的方法
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        //设置类型
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
        }
        //根据坦克的方向，绘制坦克
        switch (direct){
            case 0:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y);
                break;
            case 1:
                break;
        }
    }
}
