package NetWork.UDP;

import java.io.IOException;
import java.net.*;

public class cilent {
    public static void main(String[] args) throws IOException {

        //创建 DatagramSocket对象，准备发送和接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9998);

        //创建data对象
        byte[] buf = "hello 明天吃火锅".getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1"),9999);

        datagramSocket.send(packet);

        //关闭资源
        datagramSocket.close();
    }
}
