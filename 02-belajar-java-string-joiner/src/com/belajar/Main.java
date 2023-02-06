// STRING JOINER

/*------------------------------------------------------------
*| STRING JOINER
*|------------------------------------------------------------
*| - Biasanya digunakan untuk membuat string squence
*|   yang dipisahkan dengan deliliter.
*| - Joiner juga mendukung sufix dan prefix.
*| - Biasanya bisa digunakan untuk print array sesuai kita mau.
*/

package com.belajar;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 02 string joiner");

        String[] nama = {"jarat","asih","pradana"};

        StringJoiner stringJoiner = new StringJoiner("-","<",">");

        for (var namaku : nama) {
            stringJoiner.add(namaku);
        }

        System.out.println(stringJoiner);

    }
}