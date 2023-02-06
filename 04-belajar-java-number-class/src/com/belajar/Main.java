// NUMBER CLASS

/*------------------------------------------------------------
*| NUMBER CLASS
*|------------------------------------------------------------
*| - Semua clas number yang bukan primitif memiliki parent class
*|   yang sama yaitu class number.
*| - class number memiliki method untuk megubah ke tipe lain.
*| - Bila string dapat dengan parseXxx() bila data primitif.
*| - Bila string dapat dengan ValueOf() bila data non primitif.
*/

package com.belajar;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 04 number class");

        Integer intValue = 10_000_000;

        Short shortValue = intValue.shortValue();
        System.out.println(shortValue);

        Long longValue = shortValue.longValue();
        System.out.println(longValue);

        // unutk string ke number class.
        String number = "1000000";
        intValue = Integer.valueOf(number);

        System.out.println(intValue);

        number = "1000";
        shortValue = Short.valueOf(number);

        System.out.println(shortValue);

    }
}