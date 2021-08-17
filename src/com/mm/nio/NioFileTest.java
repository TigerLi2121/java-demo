package com.mm.nio;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * NioFileTest
 *
 * @author lwl
 * @date 2021-08-17 11:09
 */
public class NioFileTest {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/xmly/Downloads/OTA升级.jpeg");
        FileInputStream is = new FileInputStream(file);
        FileOutputStream os = new FileOutputStream("/Users/xmly/Downloads/OTA升级2.jpeg");
        FileChannel isChannel = is.getChannel();
        FileChannel osChannel = os.getChannel();
        isChannel.transferTo(0L, file.length(), osChannel);
    }

}
