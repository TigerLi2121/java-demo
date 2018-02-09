package com.mm.socket.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Shmily
 * @date 2018-01-08 08:08:08
 */
public class ServerTest {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            //Socket s = null;
            //客户端连接数
            int count = 0;
            System.out.println("****等待客户端连接****");
            //循环监听，等待客户端连接
            while (true) {
                Socket s = ss.accept();
                SocketThread st = new SocketThread(s);
                st.start();
                count++;
                System.out.println("客户端数量："+count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
