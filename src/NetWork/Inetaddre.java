package NetWork;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Inetaddre {
    public static void main(String[] args) {
        try {
            InetAddress intet = InetAddress.getLocalHost();
            System.out.println(intet);

            //根据指定的主机名 获取 InetAddress对象
            InetAddress in = InetAddress.getByName("DESKTOP-11");
            System.out.println("host1="+in);

            //根据一个域名返回一个InetAddress对象
            InetAddress host2 = InetAddress.getByName("www.baidu.com");
            System.out.println("host2="+host2);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
    public static void exercise(){
        //1. 本机的9999端口坚挺，等待连接
        try {
            ///要求在本机没有占用9999端口
            //severSocket可以通过accept()返回多个Socket，实现服务器并发
            ServerSocket serverSocket = new ServerSocket(9999);
            //2.当没有客户在9999端口上，程序就会阻塞
            //如果有客户端连接，则会返回Socket对象,程序继续
            Socket so =serverSocket.accept();
            System.out.println("socket=" + so.getClass());
            //通过socket.InputStream读写客户端的数据，
            InputStream in = so.getInputStream();
            //4.IO读取
            byte[] buf = new byte[1024];
            int readLine = 0;
            while((readLine = in.read(buf)) != -1){
                //System.out.println(new String(buf,0,readLine));
            }
            in.close();
            serverSocket.close();
            so.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
