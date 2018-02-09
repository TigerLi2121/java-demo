package com.mm.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author: Shmily
 * @date: 2018/2/9 9:51
 **/
public class DateTest {
    public static void main(String[] args) {
        System.out.println("==================================");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 1);
        calendar.add(Calendar.HOUR, 25);
        Date date = calendar.getTime();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
        System.out.println("==================================");
        System.out.println(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(DateTimeFormatter.ofPattern("uuuuMMdd").format(LocalDate.now()));
        System.out.println(DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDate.now()));
        System.out.println(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").format(LocalDateTime.now()));
        System.out.println("==================================");
        LocalDateTime nowDate = LocalDateTime.now();
        nowDate = nowDate.plusDays(1);
        nowDate = nowDate.plusHours(2);
        System.out.println(nowDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

    }
}
