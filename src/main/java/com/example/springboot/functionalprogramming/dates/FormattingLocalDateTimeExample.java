package com.example.springboot.functionalprogramming.dates;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class FormattingLocalDateTimeExample {


    public static void parseLocalDateTime(){

        String dateTime = "2018-04-18T14:33:33";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("localDateTime1 : " + localDateTime1);

        LocalDateTime localDateTime10 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_DATE_TIME);

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
        df.setTimeZone(tz);
        String nowAsISO = df.format(new Date());

        System.out.println(nowAsISO);
        System.out.println("localDateTime10 : " + localDateTime10);


        String dateTime1 = "2018-04-1814|33|33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH|mm|ss");
        System.out.println("custom date time format: " + LocalDateTime.parse(dateTime1,dateTimeFormatter));

        String dateTime2 = "2018-04-18abc14|33|33";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");

        System.out.println("custom date time format: " + LocalDateTime.parse(dateTime2,dateTimeFormatter1));

    }

    public static void formatLocalDateTime(){

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String convertedDate = localDateTime.format(dateTimeFormatter1);
        System.out.println("convertedDate : " + convertedDate);
    }


    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();

    }
}
