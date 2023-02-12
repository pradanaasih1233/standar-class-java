// BASE64

/*------------------------------------------------------------
*| BASE64
*|------------------------------------------------------------
*| - Ada sejak java 8.
*| - Cara untuk merubah binary data ke text yang aman.
*| - Aman disini bukan dari sisi scurity, tetapi dari kesalahan
*|   parsing.
*/

package com.belajar;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 12 BASE64");

        String data = "jarat adalah progammer terbaik";

        String encode = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encode);

        byte[] bytes = Base64.getDecoder().decode(encode);
        String result = new String(bytes);

        System.out.println(result);

    }
}