// STRING TOKENIZER

/*------------------------------------------------------------
*| STRING TOKENIZER
*|------------------------------------------------------------
*| - Biasanya digunakan untuk membuat string yang dapat dipecah-pecah
*|   dengan metode lazy.
*| - Lebih hemat memeori karena data tidak di-load semua ke
*|   memory, tetapi dapat menyesuaikan dengan kebutuhan.
*/

package com.belajar;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 03 string tokenizer");

        String kalimat = "kapan kamu jarat akan belajar bersama dengan saya, jangan lama-lama nanti takut lupa.";
        String buf;
        StringTokenizer stringTokenizer = new StringTokenizer(kalimat," ");

        while (stringTokenizer.hasMoreTokens()){
            buf = stringTokenizer.nextToken();
            System.out.println(buf);
        }

    }
}