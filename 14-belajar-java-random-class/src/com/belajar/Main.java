// RANDOM CLASS

/*------------------------------------------------------------
*| RANDOM CLASS
*|------------------------------------------------------------
*| - Untuk mendapatkan nilai acak.
*/

package com.belajar;

import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 14 random");

        Random random = new Random();

        for (int i = 1; i <= 100; i++) {

            System.out.println("Dadu ke " + i);
            int dadu = random.nextInt(6);
            dadu++;
            System.out.println("adalah : " + dadu);

        }
    }
}