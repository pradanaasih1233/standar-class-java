// BOJECTS CLASS

/*------------------------------------------------------------
*| OBJECTS CLASS
*|------------------------------------------------------------
*| - Ini berbeda dengan class object tanpa s.
*| - Object adalah class utility yang berisikan banyak static method
*|   yang bisa kita gunakan untuk operasi / melakukan pengecekan
*|   sebelum operasi dilakukan.
*/

package com.belajar;

import java.util.Objects;

class Data{
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Data)) return false;
        Data data1 = (Data) o;
        return Objects.equals(data, data1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 13 OBJECTS PAKE S");

        runData(null);
        runData(new Data("jarat asih pradana"));

    }

    // disini dia.
    public static void runData(Data data){

        // cara yang kurang tepat.
        // if(data != null){
        //     System.out.println(data);
        //     System.out.println(data.hashCode());
        // }

        // cara yang benar.
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}