// UUID

/*------------------------------------------------------------
*| UUID
*|------------------------------------------------------------
*| - Merupakan cara untuk membuat data unique, bisa untuk primary
*|   key.
*| - UUID atau Universally Unique Identifier.
*| - UUID adalah format standard untuk memebuat unique value yang
*|   telah terjamin.
*/

package com.belajar;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 11 UUID");

        for (int i = 0; i < 100; i++) {

            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();
            System.out.println(key);

        }

    }
}