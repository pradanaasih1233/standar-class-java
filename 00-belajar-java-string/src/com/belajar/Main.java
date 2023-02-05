// STRING

/*------------------------------------------------------------
*| STRING
*|------------------------------------------------------------
*| - Merupakan tipe data yang menampung data kata/kalimat.
*-------------------------------------------------------------
*
*
*   Method              keterangan
* ------------------------------------------------------------
*  toLowercase()        membuat kalimat menjadi non kapital.
*  toUppercase()        membuat kalimat menjadi kapital.
*  dll.
*/

package com.belajar;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 00 string class");

        String kata ="Kalimat tanya apa adalah";

        System.out.println(kata.toLowerCase());
        System.out.println(kata.toUpperCase());

        System.out.println(kata.charAt(0));
        System.out.println("dll");


    }
}