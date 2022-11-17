package paint;

import javax.swing.*;
import java.awt.*;

public class basic extends JFrame{
    private MyPanel mp = null;
    public static void main(String[] args) {
        new basic();
    }
    public basic(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//先定一个MyPanel类，继承JPanel类，画图形，就在面板上画
class MyPanel extends JPanel{
    //MyPanel既是一个画板
    //Graphics g 类似于画笔

    @Override
    public void paint(Graphics g) {
        //调用父类完成初始化
        super.paint(g);
        //画出一个圆形
        g.drawOval(10,10,100,100);
        //画一个直线
        g.drawLine(10,10,100,100);

        //设置画笔颜色
        g.setColor(Color.BLUE);
        g.fillRect(10,10,100,100);

        //画图片
        Image iamge = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/"));
        g.drawImage(iamge,10,10,175,221,this);
        //写字符串
        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("北京你好",100,100);
    }
}

