package Object;

public class migong {
    public static void main(String[] args){
        int[][] map = new int[8][7];
        for(int i = 0;i<7;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for(int i = 0;i<8;i++){
            map[i][0] = 1;
            map[i][6] = 1;

        }
        map[3][1]=1;
        map[3][2]=1;
    }
}
class T {
    //0，表示可以走，1，表示障碍物，2，表示可以走，3，表示走过，但是走不通是死路
    public boolean findWay(int[][] map,int i, int j){
        if(map[6][5]==2){//找到
            return true;
        }else{
            if(map[i][j]==0){//可以走
                //假定可以走通
                map[i][j]=2;
                //下右上左
                if(findWay(map,i+1,j)){
                    return true;
                } else if (findWay(map,i,j+1)) {
                    return true;
                } else if (findWay(map,i-1,j)) {
                    return true;
                } else if (findWay(map,i,j-1)) {
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
