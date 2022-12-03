package File.Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String[] args) {
        String filePath = "d:\\a.txt";
        //创建BufferWriter
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write("我还是那个人！");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
