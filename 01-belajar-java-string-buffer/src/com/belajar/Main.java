// STRING BUFFER DAN BUILDER

/*------------------------------------------------------------
*| STRING BUFFER DAN BUILDER
*|------------------------------------------------------------
*| - Merupakan tipe data yang menampung data kata/kalimat
*|   yang memiliki cara penyimpanan data yang lebih efisien
*|   secara memori.
*| - String buffer lebih tread safe dan labat.
*| - Keduanya secara fungsi sama hanya saja berbeda pada
*|   kecepatan akses.
*-------------------------------------------------------------
*/

package com.belajar;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 01 string buffer dan builder");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("nama saya anton");
        stringBuffer.append(", kamu juga anton");

        System.out.println(stringBuffer);

    }
}