package com.mm.nio;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;

/**
 * @author lwl
 * @date 2019/5/5
 */
public class NioTest {

    public static void main(String[] args) {
        String s = "哈哈哈哈哈";
        ByteBuffer buffer = ByteBuffer.allocate(100);
        buffer.put(s.getBytes());


    }
}
