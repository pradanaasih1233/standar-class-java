// ARRAYS CLASS

/*------------------------------------------------------------
*| ARRAYS CLASS
*|------------------------------------------------------------
*| - Method static dari class Arrays untuk mengelola data array.
*/

package com.belajar;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 16 arrays class");

        int[] array = {1,332,42,53423,1243,343,43};

        // urutkan array.
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // cari data.
        int a = Arrays.binarySearch(array,42);
        System.out.println(a);

        // copy nilai array.
        int[] array2 = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(array2));

        // bandingkan array.
        System.out.println(Arrays.equals(array,array2));

    }
}