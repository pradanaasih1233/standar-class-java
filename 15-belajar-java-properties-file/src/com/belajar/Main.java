// PROPERTIES FILE

/*------------------------------------------------------------
*| PROPERTIES FILE
*|------------------------------------------------------------
*| - Untuk menyimpan konfigurasi atau variabel ke dalam file.
*/

package com.belajar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 15 properties file");

        Properties properties = new Properties();

        System.out.println("menampiklan data file properties file");

        try{

            properties.load(new FileInputStream("config.properties"));
            System.out.println("membaca file berhasil...");

            // baca.
            String data = properties.getProperty("database.host");
            System.out.println(data);
            data = properties.getProperty("database.port");
            System.out.println(data);
            data = properties.getProperty("database.username");
            System.out.println(data);
            data = properties.getProperty("database.password");
            System.out.println(data);

        } catch (FileNotFoundException e) {
            System.out.println("file tidak ditemukan...");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("error file...");
            throw new RuntimeException(e);
        }

        try{
            // tulis.
            properties.put("database.ok","true");

            properties.store(new FileOutputStream("config2.properties",true),"data config");
            System.out.println("memyimpan data file berhasil...");

        } catch (FileNotFoundException e) {
            System.out.println("file tidak ditemukan...");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("error file...");
            throw new RuntimeException(e);
        }
    }
}
