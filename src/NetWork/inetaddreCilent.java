package NetWork;

import java.io.IOException;
import java.io.OutputStream;
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
            //写入信息
            out.write("hello".getBytes());
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
