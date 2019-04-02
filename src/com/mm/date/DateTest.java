package com.mm.date;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
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
        System.out.println(LocalDate.now().toString());
        System.out.println(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(DateTimeFormatter.ofPattern("uuuuMMdd").format(LocalDate.now()));
        System.out.println(DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDate.now()));
        System.out.println(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").format(LocalDateTime.now()));
        System.out.println("==================================");
        LocalDateTime nowDate = LocalDateTime.now();
        nowDate = nowDate.plusDays(0);
        nowDate = nowDate.plusHours(2);
        System.out.println(nowDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(DateTimeFormatter.ofPattern("yyyy-w").format(LocalDateTime.now()));
        System.out.println(DateTimeFormatter.ofPattern("yyyyMM").format(LocalDateTime.now().plusMonths(-1)));
        System.out.println("t:"+DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now().plusDays(-1)));
        System.out.println("==================================");
        String birthdayStr1 = "2008-08-08";
        String birthdayStr2 = "2008-08-09";
        LocalDate birthday1 = LocalDate.parse(birthdayStr1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate birthday2 = LocalDate.parse(birthdayStr2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(birthday1);
        System.out.println(birthday2);
        Period period = Period.between(birthday1, birthday2);
        System.out.println(period.getDays());
        System.out.println("==================================");
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println("==================================");
        LocalDateTime localDateTime = LocalDateTime.parse("2018-08-01 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(localDateTime.plusMonths(-1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("==================================");
        LocalDate thisWeekFirstDay = LocalDate.now().with(DayOfWeek.MONDAY);
        System.out.println(thisWeekFirstDay.toString());
        System.out.println("==================================");
        String lastWeekFirstDay = thisWeekFirstDay.plusDays(-7).toString();
        String lastWeekEndDay = thisWeekFirstDay.plusDays(-1).toString();
        System.out.println("lastWeekFirstDay:"+lastWeekFirstDay);
        System.out.println("lastWeekEndDay:"+lastWeekEndDay);
        System.out.println("==================================");
        LocalDate playerDate = LocalDate.from(DateTimeFormatter.ofPattern("yyyy-MM-dd").parse("2018-02-21"));
        long years = ChronoUnit.YEARS.between(playerDate, nowDate);
        long months = ChronoUnit.MONTHS.between(playerDate, nowDate);
        System.out.println(years);
        System.out.println(months);
        System.out.println("==================================");
        //本月的最后一天
        System.out.println("本月的第一天"+LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("本月的最后一天"+LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));
    }

}
