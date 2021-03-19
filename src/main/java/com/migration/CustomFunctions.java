package com.migration;

        import java.math.BigInteger;
        import java.util.logging.Logger;

public abstract class CustomFunctions {

    private static Logger logger = Logger.getLogger(CustomFunctions.class.getName() );
    /*
    public static BigInteger farmFingerPrint(java.math.BigInteger id) {
        return id.multiply(BigInteger.valueOf(34));
    }
    public static String asString(java.math.BigInteger id) {
        return id.toString();
    }

     */

    public static String bitReverse(Long id) {
        return String.valueOf(Long.reverse(id));
    }

    public static void main(String[] args) {
        System.out.println(bitReverse(-4611686018427387904L));
        System.out.println(bitReverse(-2305843009213693952L));
    }

}
