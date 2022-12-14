package Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener,Runnable {
    //定义我的坦克
    MyTank hero = null;
    //定义敌人的Tank
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //存放炸弹
    Vector<Bomb> bombs = new Vector<>();

    public MyPanel(){
        //初始化我的Tank
        hero = new MyTank(100,100);
        hero.setSpeed(2);
        for(int i = 0;i<3;i++){
            EnemyTank en = new EnemyTank((100*(i+1)),0);
            en.setDirect(2);
            Shot shot = new Shot(en.getX()+20,en.getY()+60,en.getDirect());
            en.shots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(en);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //填充矩形
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(), hero.getY(),g, hero.getDirect(), 0);
        for(int i = 0;i<enemyTanks.size();i++){
           EnemyTank en = enemyTanks.get(i);
           if(en.isLive==true){
               drawTank(en.getX(),en.getY(),g,en.getDirect(),1);
               for (int j = 0; j < en.shots.size(); j++) {
                   Shot shot = en.shots.get(j);
                   if(shot.isLive==true){
                       g.draw3DRect(shot.x,shot.y,1,1,false);
                   }else{
                       en.shots.remove(j);
                   }
               }
           }else{

           }
        }
        if(hero.shot!=null&&hero.shot.isLive == true){
            //画出射击的子弹
            g.draw3DRect(hero.shot.x,hero.shot.y,1,1,false);
        }
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
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y+60);
                break;
            case 3:
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x,y+20);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W){
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode()==KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        }
        else if (e.getKeyCode()==KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        else if (e.getKeyCode()==KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        }
        if(e.getKeyCode()==KeyEvent.VK_J){
            hero.shotEnemy();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //位置换了
            if(hero.shot!=null&&hero.shot.isLive){
                for(int i = 0;i<enemyTanks.size();i++){
                    EnemyTank en = enemyTanks.get(i);
                    hitTank(hero.shot,en);
                }
            }
            this.repaint();
        }
    }
    public void hitTank(Shot s,EnemyTank tank){
        //判断s，集中tank
        switch (tank.getDirect()){
            case 0:
            case 2:
                if(s.x>tank.getX()&&s.x<tank.getX()+40&&s.y> tank.getY()&&s.y<tank.getY()+60){
                    s.isLive = false;
                    tank.isLive = false;
                }
                break;
            case 1:
                if(s.x>tank.getX()&&s.x<tank.getX()+40&&s.y> tank.getY()&&s.y<tank.getY()+60){
                    s.isLive = false;
                    tank.isLive = false;
                }
                break;
            case 3:
                if(s.x>tank.getX()&&s.x<tank.getX()+60&&s.y> tank.getY()&&s.y<tank.getY()+40){
                    s.isLive = false;
                    tank.isLive = false;
                }
                break;
        }
    }
}
