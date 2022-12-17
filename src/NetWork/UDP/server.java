package NetWork.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class server {
    public static void main(String[] args) throws IOException {
        //1.创建一个DatagramSocket对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);

        //2.构建一个DatapramPacket对象，准备接收数据
        //一个数据包最大64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);

        //3.调用方法接收方法，通过这个包对象
        //填充packet对象，有数据报包的时候，就会接受到数据
        //如果没有数据就会阻塞
        System.out.println("接收端，等待数据~~~");
        socket.receive(packet);

        //4.将packet进行拆包
        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        //5.关闭资源

    }
}
