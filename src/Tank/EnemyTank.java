package Tank;

import java.util.Vector;

public class EnemyTank extends Tank{
    boolean isLive = true;
    Vector<Shot> shots = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
