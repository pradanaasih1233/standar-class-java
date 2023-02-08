// SCANNER

/*------------------------------------------------------------
*| SCANNER
*|------------------------------------------------------------
*| - Merupakan cara untuk dapat menggambil data dari user ke
*|   ke dalam aplikasi dengan variable tertentu.
*/

package com.belajar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 07 scanner");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama anda : ");
        String nama = scanner.nextLine();

        System.out.print("Masukan umur anda : ");
        Integer umur = scanner.nextInt();

        System.out.println("nama anda adalah " + nama + " dan umur anda adalah " + umur + " tahun");

    }
}