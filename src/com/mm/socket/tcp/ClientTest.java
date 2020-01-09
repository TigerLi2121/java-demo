package com.mm.socket.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author shmily
 * @date 2018-01-08 08:08:08
 */
public class ClientTest {
    public static void main(String[] args) {
        Socket s = null;
        OutputStream os = null;
        PrintWriter pw = null;
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        Boolean endFlag = false;
        try {
            while (!endFlag){
                s = new Socket("localhost", 8888);
                os = s.getOutputStream();
                pw = new PrintWriter(os);
                System.out.println("请输入发送的消息：");
                Scanner scanner = new Scanner(System.in);
                String sendMessage = scanner.next();
                pw.write(sendMessage);
                pw.flush();
                s.shutdownOutput();
                is = s.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
                String message = null;
                if ((message = br.readLine()) != null)
                    System.out.println("message from server:"+message);
                s.close();
                if ("shutDown".equals(sendMessage))
                    endFlag = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
