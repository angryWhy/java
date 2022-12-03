package File.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class fileReader {
    public static void main(String[] args) {

    }
    public void readSingle(){
        String filePath = "d:\\a.txt";
        FileReader fileRead = null;
        int data = ' ';
        try {
            fileRead = new FileReader(filePath);
            //循环读取 使用read
            while ((data = fileRead.read())!=-1){
                System.out.println((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileRead!=null){
                try {
                    fileRead.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    //读取一个字符数组
    public void readArray(){
        String filePath = "d:\\a.txt";
        FileReader fileRead = null;
        int readLine = 0;
        char[] buff = new char[8];
        try {
            fileRead = new FileReader(filePath);
            //循环读取 使用read(buf),返回的是实际读到的字符数
            while ((readLine = fileRead.read(buff))!=-1){
                System.out.println(new String(buff,0,readLine));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileRead!=null){
                try {
                    fileRead.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
