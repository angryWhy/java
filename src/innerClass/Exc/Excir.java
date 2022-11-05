package innerClass.Exc;

public class Excir {

}
class Fork{
    private static int CurrentNum = 10000;
    private int sNum;
    public Fork(){
        this.sNum=getNextNum();
    }
    public static int getNextNum(){
        CurrentNum+=100;
        return CurrentNum;
    }

    public int getsNum() {
        return sNum;
    }
}