// REGEX

/*------------------------------------------------------------
*| REGEX
*|------------------------------------------------------------
*| - Merupakan cara untuk dapat mencari kata string dalam data.
*| - Secara garis besar terdapat 2 class regex yaitu Pattern
*|   Matcher class.
*| - Pattern class adalah representasi hasil kompilasi dari
*|   pola expression yang kita buat.
*| - Matcher class adalah engine untuk melakukan pencarian dari
*|   pattern yang telah dibuat.
*/

package com.belajar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 17 regex");

        String nama = "kalimat tanya adalah kalimat yang akan sangat luar biasa";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[l][a-zA-Z]*");

        Matcher matcher = pattern.matcher(nama);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}