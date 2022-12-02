package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {
    public static void main(String[] args) {
        //完成文件拷贝
        //将一个图片拷贝到另外一个位置
        //创建输入流，将文件输入到程序内
        //创建输出流，将程序内输出到指定文件位置
        String filePath = "d:\\a.txt";
        String newFile = "d:\\b.txt";
        try {
            FileInputStream fi = new FileInputStream(filePath);
            FileOutputStream fo = new FileOutputStream(newFile);

            //定义一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fi.read(buf))!=-1){
                //读取到文件，就写进去
                //边读边写
                //以最后字节长度为准，否则文件损失
                fo.write(buf,0,readLen);
            }
            System.out.println("copy ok");
            if(fi!=null){
                fi.close();
            }
            if(fo!=null){
                fo.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
