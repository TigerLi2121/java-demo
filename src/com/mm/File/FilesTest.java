package com.mm.File;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Shmily
 * @date: 2018/2/9 10:33
 **/
public class FilesTest {
    public static void main(String[] args) {
        /*Path path = Paths.get("file/demo/demo.txt");
        if (!Files.exists(path)) {
            try {
                Path dirPath = Files.createDirectories(Paths.get("file/demo"));
                System.out.println("dirPath:" + dirPath.toString());
                Path filePath = Files.createFile(path);
                System.out.println("filePath:" + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            List<String> poem = new ArrayList<>();
            poem.add("水晶潭底银鱼跃");
            poem.add("清徐风中碧竿横");
            // 直接将多个字符串内容写入指定文件中
            Files.write(path, poem, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
            // 使用Java 8新增的Stream API列出当前目录下所有文件和子目录
            Files.list(Paths.get(".")).forEach(dirPath -> System.out.println(dirPath));
            // 使用Java 8新增的Stream API读取文件内容
            Files.lines(path, Charset.forName("UTF-8")).forEach(line -> System.out.println(line));
            // 获取文件信息
            BasicFileAttributes ra = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("FILE SIZE:" + ra.size());
            System.out.println("FILE SIZE:" + Files.getAttribute(path, "size"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        File file = new File("d:/aa.js");
        System.out.println(file.exists());
    }
}
