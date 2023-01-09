package com.object.TestObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test005 {

    public static void main(String[] args) throws ParseException {

        //日期转换器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //格式化日期字符串
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now:"+now);
        String nowStr = now.format(formatter);  //放入格式器
        System.out.println(nowStr);
        String dateStr = "2020-02-25 11:23:04";
        //转成日期
        LocalDateTime date = LocalDateTime.parse(dateStr, formatter);//放入格式器
        System.out.println("date:"+date);
        //获取日
        System.out.println(date.getDayOfMonth());
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1999, 3, 15);
        //时期间隔 年月日
        Period p = Period.between(birthDate, today);
        System.out.printf(p.getYears() + "年" + p.getMonths() + "d" + p.getDays() + "日");
        LocalDate startDate = LocalDate.of(1993, 8, 19);
        LocalDate endDate = LocalDate.of(1994, Month.JANUARY, 16);
        //期量单位 间隔
        long between = ChronoUnit.YEARS.between(startDate, endDate);
        System.out.println("两年之间的差   : " + between); //0 不是1不满一年不计算在内
        between = ChronoUnit.MONTHS.between(startDate, endDate);
        System.out.println("两月之间的差   : " + between); //4 不是5不满一月不计算在内
        //瞬间

    }
}
