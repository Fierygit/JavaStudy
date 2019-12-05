package Socket.UDP;

/**
 * @author Firefly
 * @version 1.0
 * @date 2019/12/4 23:46
 */


import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception {

    }


    public static void sendFile(String path) throws Exception {

        File file = new File(path);
        FileInputStream is = new FileInputStream(file);
        InetAddress address = InetAddress.getByName("localhost");

        DatagramSocket datagramSocket = new DatagramSocket();


        byte[] buffer = new byte[1024 * 1024];


        while (is.read(buffer) != -1) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 8088);
            datagramSocket.send(packet);
        }

        DatagramPacket inputPacket = new DatagramPacket(new byte[512], 512);
        datagramSocket.receive(inputPacket);
        System.out.println(new String(inputPacket.getData(), 0, inputPacket.getLength()));
        datagramSocket.close();

    }


    public static void sendText() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");


        String msg = "";


        while ((msg = reader.readLine()) != "") {
            //发送数据
            byte[] buffer = msg.getBytes();


            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 8088);
            datagramSocket.send(packet);

            //接收数据
            DatagramPacket inputPacket = new DatagramPacket(new byte[512], 512);
            datagramSocket.receive(inputPacket);
            System.out.println(new String(inputPacket.getData(), 0, inputPacket.getLength()));
            datagramSocket.close();
        }


    }

}
