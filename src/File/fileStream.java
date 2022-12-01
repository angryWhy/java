package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileStream {
    public static void main(String[] args) {

    }
    //单个字节读取，效率低
    public void readFile(){
       File file = new File("d:\\a.txt");
       int readData = 0;
        try {
            FileInputStream fi = new FileInputStream(file);
            //从流文件中读取一个字节的数据，如果没有输入可用，方法会被阻止
            //-1，就是读完了
            try {
                while((readData = fi.read())!=-1 ){
                    System.out.println((char)readData);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fi.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    //读取byte数组
    public void readFile2(){
        File file = new File("d:\\a.txt");
        int readData = 0;
        byte[] buf = new byte[8];
        int readLen = 0;
        try {
            FileInputStream fi = new FileInputStream(file);
            //从流文件中读取一个字节数组的数据，如果没有输入可用，方法会被阻止
            //-1，就是读完了
            //读取正常。返回是字节数
            try {
                while((readLen = fi.read(buf))!=-1 ){
                    System.out.println(new String(buf,0,readLen));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fi.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
