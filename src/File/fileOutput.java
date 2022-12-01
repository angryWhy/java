package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutput {
    public static void main(String[] args) {

    }
    public void writeFile(){
        String fp = "d:\\a.txt";
        FileOutputStream fo = null;
        try {
            //new FileOutputStream()方式创建的时候，写入内容时，覆盖原来的内容
            //new FileOutputStream()创建的时候，写入内容时候，追加到文件后面
            fo = new FileOutputStream(fp);
            //写入一个字节
            try {
                fo.write('a');
                //写入多个字节
                String h = "hello world";
                fo.write(h.getBytes(),0,h.length());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
