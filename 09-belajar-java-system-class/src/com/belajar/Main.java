// SYSTEM CLASS

/*------------------------------------------------------------
*| SYSTEM CLASS
*|------------------------------------------------------------
*| - Merupakan suatu method static dalam java yang merupakan
*|   bagian dari class System.
*/

package com.belajar;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 09 System class");

        // contoh.

        // ambil path home.
        System.out.println(System.getenv("HOME"));

        // ???
        System.out.println(System.getProperties());

        // ambil waktu milisecond.
        System.out.println(System.currentTimeMillis());

        // ambil waktu nanosecond.
        System.out.println(System.nanoTime());

        // jalankan grabage collection.
        System.gc();

        // exit.
        System.exit(0);

        // dll

        System.out.println("hallo");

    }
}