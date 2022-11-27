package Tank;

public class Shot implements Runnable {
    int x;
    int y;
    //子弹方向
    int direct = 0;
    int speed = 2;
    boolean isLive = true;
    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }
    //射击行为
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //根据方向改变坐标
            switch (direct){
                case 0:
                    y-=speed;
                    break;
                case 1:
                    x+=speed;
                    break;
                case 2:
                    y+=speed;
                    break;
                case 3:
                    x-=speed;
                    break;
            }
            if(!(x>=0&&x<=1000&&y>=0&&y<=750)){
                isLive = false;
                break;
            }
        }
    }
}
