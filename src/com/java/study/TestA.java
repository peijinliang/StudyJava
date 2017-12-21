package com.java.study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crete by Marlon
 * Create Date: 12/7/2017
 * Class Describe
 **/
public class TestA {

    public static void main(String[] args) {
        String barcode = "ZEB1000000000000120";
        if (validateBarcode(barcode)) {
            System.out.println("------------------------true");
        } else {
            System.out.println("------------------------false");
        }
    }


    /**
     * ะฃั้
     * @param barcode
     * @return
     */
    public static boolean validateBarcode(String barcode) {
        if (barcode.length() != 19) {
            return false;
        }
        Pattern pattern = Pattern.compile("^ZEB\\d{16}");
        Matcher isBarCode = pattern.matcher(barcode);
        if (!isBarCode.matches()) {
            return false;
        }
        String lastCode = calculateLastCode(barcode);
        System.out.println("---------------------" + barcode.charAt(barcode.length() - 1));
        if (lastCode.equals(String.valueOf(barcode.charAt(barcode.length() - 1)))) {
            return true;
        }
        return false;
    }

    public static String calculateLastCode(String barcode) {
        byte oddsum = 0;
        byte evensum = 0;
        char[] barcode_array = barcode.toCharArray();
        for (int i = 3; i <= 17; i++) {
            if ((i - 3) % 2 == 0) {
                evensum += (barcode_array[i] - 48);
            } else {
                oddsum += (barcode_array[i] - 48);
            }
        }
        short allsum = (short) (oddsum + evensum * 3);
        String lastcode = String.format("%d", (allsum % 10 == 0) ? 0 : (10 - allsum % 10));
        System.out.println("------------------------lastcode" + lastcode);
        return lastcode;
    }


}
