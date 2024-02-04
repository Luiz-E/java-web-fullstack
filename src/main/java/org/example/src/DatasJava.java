package org.example.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DatasJava {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        calendar.setTime(simpleDateFormat.parse("10-03-2024"));
        calendar.add(Calendar.DAY_OF_MONTH, -15);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.MONTH, 2);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.YEAR, 4);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}
