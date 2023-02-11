// RUNTIME CLASS

/*------------------------------------------------------------
*| RUNTIME CLASS
*|------------------------------------------------------------
*| - Class ini tidak dapat dibuat dan kita dapat aksess dengan
*|   method getRuntime() milik class Runtime.
*/

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 10 runtime class");

        // contoh.

        // megambil jumlah cpu.
        System.out.println(Runtime.getRuntime().availableProcessors());

        // megambil jumlah memori bebas.
        System.out.println(Runtime.getRuntime().freeMemory());

        // megambil jumlah memori.
        System.out.println(Runtime.getRuntime().totalMemory());

        // megambil jumlah total maksimal memori.
        System.out.println(Runtime.getRuntime().maxMemory());

    }
}