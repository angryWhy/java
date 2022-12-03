package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        fileWriter.Writer();
    }
    public static void Writer(){
        String filePath = "d:\\a.txt";
        FileWriter fw= null;
        char[] chars = {'a','b','c'};
        try {
            fw = new FileWriter(filePath,true);
            //写入单个字符
            fw.write('h');
            //写入一个数组
            fw.write(chars);
            //写入指定数组的部分
            fw.write("我是哈哈".toCharArray(),0,3);
            //直接写入字符串
            fw.write("你好，李银河");
            //字符串部分
            fw.write("你好，北京",0,2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
