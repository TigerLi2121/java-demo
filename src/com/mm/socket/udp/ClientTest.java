package com.mm.socket.udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author shmily
 * @date 2018-01-08 08:08:08
 */
public class ClientTest {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8888);
            System.out.println("send message:");
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            byte[] bytes = message.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 6666);
            ds.send(dp);
            //接受返回数据
            ds.receive(dp);
            //bytes = new byte[dp.getLength()];
            System.out.println("result message:" + new String(dp.getData()));
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ds.close();
        }
    }
}
