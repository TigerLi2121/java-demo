package com.mm.socket.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @author Shmily
 * @date 2018-01-08 08:08:08
 */
public class SocketThread extends Thread {
    Socket s = null;

    public SocketThread(Socket socket){
        this.s = socket;
    }
    @Override
    public void run(){
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStream os = null;
        PrintWriter pw = null;
        try {
            is = s.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String message = null;
            if ((message = br.readLine()) != null)
                System.out.println("message from client:"+message);
            os = s.getOutputStream();
            pw = new PrintWriter(os);
            String sendMessage = "hello world!";
            pw.write(sendMessage);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
