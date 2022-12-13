package File.transfer;

import File.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class print {
    public static void main(String[] args) {
        //打印流只有输出流，没有输入流
        PrintStream out = System.out;
        //默认情况下，打印流PrintStream输出数据的位置标准输出，即显示器
        out.println("hello,jack");
        out.close();

        //底层是Writer,直接write打印输出
        try {
            out.write("hello".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //修改打印流输出的位置
        try {
            System.setOut(new PrintStream("d:\\a.txt"));
            //输出到这个文件了
            System.out.println("hello,jack");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
