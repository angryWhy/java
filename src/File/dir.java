package File;

import java.io.File;

public class dir  {
    public static void main(String[] args) {
        //mkdir--mkdirs，一级或者多层
    }
    //目录也被当做文件
    public void delete(){
        String filePath = "d:\\a.txt";
        File file = new File(filePath);
        if(file.exists()){
            file.delete();
        }
    }
    //如果存在，不存在就创建
    public void mk(){
        String filePath = "d:\\a";
        File file = new File(filePath);
        if(file.exists()){
            file.delete();
        }else{
            //一级
            file.mkdir();
            //二级
            file.mkdirs();
        }
    }
}
