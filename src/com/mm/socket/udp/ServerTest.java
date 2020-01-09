package com.mm.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @author shmily
 * @date 2018-01-08 08:08:08
 */
public class ServerTest {

    private static InetSocketAddress isa = null;
    private static DatagramSocket ds = null;

    public static void main(String[] args) {

        int count = 0;
        try {
            isa = new InetSocketAddress("localhost", 6666);
            ds = new DatagramSocket(isa);
            while (true){
                System.out.println("****等待客户端连接****");
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                ds.receive(dp);
                new SocketThread(dp).start();
                count ++ ;
                System.out.println("客户端数量："+count);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void response(DatagramPacket dp){
        try {
            ds.send(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
