package NetWork;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class inetaddreCilent {
    public static void main(String[] args) {
        //1.连接服务器
        try {
            //连接本机999端口，连接成功返回socket对象
            Socket socket = new Socket(InetAddress.getLocalHost(),9999);
            System.out.println("客户端");
            //连接上socket，通过socket.getOutputStream()
            //得到和socket关联的对象
            OutputStream out = socket.getOutputStream();
            //通过输出流，写入数据到数据通道，使用字符流
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(out));
            bufferedWriter.write("hello,字符流");
            bufferedWriter.newLine();
            //刷新
            bufferedWriter.flush();
            //写入信息
            out.write("hello".getBytes());
            socket.shutdownOutput();
            //获取相关联的输入流，读取数据并显示
            InputStream inputStream = socket.getInputStream();
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = inputStream.read(buf))!=-1){
                System.out.println(new String(buf,0,readLen));
            }

            //关闭
            out.close();
            socket.close();
            System.out.println("客户端退出了");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
