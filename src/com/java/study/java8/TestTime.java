package com.java.study.java8;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 * java 新的时间和日期API
 * Java8中加入了LocalDateTime, LocalDate, LocalTime, Duration, Period, Instant, DateTimeFormatter等等API
 **/
public class TestTime {

    public static void main(String[] args) {
        //创建日期
        LocalDate date = LocalDate.of(2017, 1, 21); //2017-01-21
        int year = date.getYear(); //2017
        Month month = date.getMonth(); //JANUARY
        int day = date.getDayOfMonth(); //21
        DayOfWeek dow = date.getDayOfWeek(); //SATURDAY
        int len = date.lengthOfMonth(); //31(days in January)
        boolean leap = date.isLeapYear(); //false(not a leap year)


        //时间的解析和格式化
        LocalDate localDate = LocalDate.parse("2017-01-21");
        LocalTime time = LocalTime.parse("13:45:20");

        LocalDateTime now = LocalDateTime.now();
        now.format(DateTimeFormatter.BASIC_ISO_DATE);

        //合并日期和时间
        LocalDateTime dt1 = LocalDateTime.of(2017, Month.JANUARY, 21, 18, 7);
        LocalDateTime dt2 = LocalDateTime.of(localDate, time);
        LocalDateTime dt3 = localDate.atTime(13, 45, 20);
        LocalDateTime dt4 = localDate.atTime(time);
        LocalDateTime dt5 = time.atDate(localDate);

        //操作日期
        LocalDate date1 = LocalDate.of(2014, 3, 18); //2014-3-18
        LocalDate date2 = date1.plusWeeks(1); //2014-3-25
        LocalDate date3 = date2.minusYears(3); //2011-3-25
        LocalDate date4 = date3.plus(6, ChronoUnit.MONTHS); //2011-09-25

    }


}
