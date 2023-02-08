// DATE AND CALENDAR

/*------------------------------------------------------------
*| DATE AND CALENDAR
*|------------------------------------------------------------
*| - Merupakan suatu cara untuk mepresentasikan waktu dapat
*|   sampai ke satuan milisecond.
*/

package com.belajar;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 08 date and calendar");

        // dalam contoh ini akan membuat waktu saat ini dalam aplikasi ini.
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        calendar.set(Calendar.YEAR,2000);
        date = calendar.getTime();
        System.out.println(date);

        calendar.set(Calendar.MONTH,Calendar.MAY);
        date = calendar.getTime();
        System.out.println(date);

        calendar.set(Calendar.DAY_OF_MONTH,4);
        date = calendar.getTime();
        System.out.println(date);

        calendar.set(Calendar.HOUR_OF_DAY,10);
        date = calendar.getTime();
        System.out.println(date);

        calendar.set(Calendar.MINUTE,10);
        date = calendar.getTime();
        System.out.println(date);

        calendar.set(Calendar.MILLISECOND,10);
        date = calendar.getTime();
        System.out.println(date);


        System.out.println("\n" + new Date(17323863432l));


    }
}