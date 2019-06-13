package com.mm.file;

import java.io.*;
import java.nio.file.*;

/**
 * @author: Shmily
 * @date: 2018/2/9 13:43
 **/
public class FileUtils {

    public static void main(String[] args) {
        String filePath = "file/demo/test.txt";
        deleteFile(filePath);
        byte2File("哈哈呵呵".getBytes(), filePath);
        byte2File2("嘿嘿".getBytes(), filePath);
        try {
            OutputStream outputStream = new FileOutputStream(new File("file/demo/demo.txt"));
            file2OutputStream(outputStream, filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(file2Byte(filePath).length);
    }

    /**
     * 字节转文件
     * 文件不存在
     * @param bytes
     * @param fielPath
     */
    public static void byte2File(byte[] bytes, String fielPath) {
        try {
            Files.copy(new ByteArrayInputStream(bytes), Paths.get(fielPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 字节转文件
     * 文件已存在
     * @param bytes
     * @param fielPath
     */
    public static void byte2File2(byte[] bytes, String fielPath) {
        try {
            Files.write(Paths.get(fielPath), bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件转字节
     * @param filePath
     * @return
     */
    public static byte[] file2Byte(String filePath){
        byte[] result = null;
        try {
            result = Files.readAllBytes(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 文件转输出流
     * @param outputStream
     * @param filePath
     */
    public static void file2OutputStream(OutputStream outputStream, String filePath){
        try {
            Files.copy(Paths.get(filePath), outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件
     * @param filePath
     */
    public static void deleteFile(String filePath){
        try {
            Files.deleteIfExists(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
