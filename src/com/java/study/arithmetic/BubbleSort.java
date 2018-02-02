package com.java.study.arithmetic;

/**
 * java  µœ÷
 * √∞≈›≈≈–Ú(…˝–Ú£©
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = new int[]{ 6, 7, 9,1, 3, 5,};
        int[] results = bubblesort(nums);
        for (int x : results) {
            System.out.print(x + ",");
        }
    }

    public static int[] bubblesort(int[] sort) {
        int temp = 0;
        for (int x = 0; x < sort.length - 1; x++) {
            for (int y = 0; y < sort.length - 1 - x; y++) {
                if (sort[y] > sort[y + 1]) {
                    temp = sort[y];
                    sort[y] = sort[y+1];
                    sort[y+1] = temp;
                }
            }
        }
        return sort;
    }




}
