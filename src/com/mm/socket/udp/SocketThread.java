package com.mm.socket.udp;

import java.net.DatagramPacket;

/**
 * @author Shmily
 * @date 2018-01-08 08:08:08
 */
public class SocketThread extends Thread {
    private DatagramPacket dp;

    public SocketThread(DatagramPacket dp) {
        this.dp = dp;
    }

    @Override
    public void run() {
        try {
            String message = new String(dp.getData());
            System.out.println("message from client:" + message + " ip:" + dp.getAddress() + " port:" + dp.getPort());
            dp.setData(("hello " + message + "; I'm from UDP Server!").getBytes());
            ServerTest.response(dp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
