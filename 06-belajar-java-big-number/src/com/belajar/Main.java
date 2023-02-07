// BIG NUMBER

/*------------------------------------------------------------
*| BIG NUMBER
*|------------------------------------------------------------
*| - Big number digunakan untuk membuat variabel yang besarnya
*|   melebihi long dan double.
*| - BigInteger untuk nilai bulat.
*| - BigDecimal untuk nilai pecahan.
*|
*|
*|------------------------------------------------------------
*|      METHOD                          OPERATOR
*|------------------------------------------------------------
*| add                                      +
*| subtrace                                 -
*| multiply                                 *
*| divide                                   /
*| mod                                      %
*/

package com.belajar;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 06 big number");

        Long intValue = 1000_000_000_000_000_000L;
        BigInteger a = new BigInteger("1000000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000000");
        BigInteger c = a.add(b);

        System.out.println(c);

        a = new BigInteger("2000000000000000000000");
        b = new BigInteger("1000000000000000000000");
        c = a.subtract(b);

        System.out.println(c);

        a = new BigInteger("434348934645043443");
        b = new BigInteger("98343587634");
        c = a.multiply(b);

        System.out.println(c);


    }
}