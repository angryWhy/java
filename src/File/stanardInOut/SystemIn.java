package File.stanardInOut;

import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {
        //System类的public finial static InputStream in = null;
        //System.in  编译类型是InputStream
        //System.in 运行类型是 BufferInputStream
        System.out.println(System.in.getClass().getName());


        //System.outpublic finial static InputStream out = null;
        //编译类型是 PrintStream
        //运行类型PrintStream
        //标准输出
        System.out.println();

        //标准输入，bufferinputstream
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        //获取输入后的值
        System.out.println(next);
    }
}
