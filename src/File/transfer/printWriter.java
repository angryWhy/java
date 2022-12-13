package File.transfer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter("e:\\a.txt"));
            printWriter.write("hello");
            //要关闭，否则没有内容
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //默认输出位置，显示器
        printWriter.print("hello,jack");

    }
}
