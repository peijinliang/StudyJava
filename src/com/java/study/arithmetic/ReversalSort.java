package com.java.study.arithmetic;

/**
 * 数据反转操作
 * 两种算法操作
 * <p>
 * 二维数组转换
 */
public class ReversalSort {

    public static void main(String[] args) {
        int[] arry = new int[]{1, 2, 3, 4, 5, 6, 9};
        int[] result = reversalSort2(arry);
        for (int x : result) {
            System.out.print(x + ",");
        }
        System.out.println();
        int data[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        reversalSort(data);
        printArray(data);
    }


    /**
     * 时间复杂度较大
     *
     * @param arr
     * @return
     */
    public static int[] reversalSort1(int[] arr) {
        int[] temp = new int[arr.length];
        int foot = 0;
        for (int x = arr.length - 1; x >= 0; x--) {
            temp[foot++] = arr[x];
        }
        return temp;
    }

    public static int[] reversalSort2(int[] arr) {
        int center = arr.length / 2;
        int head = 0;
        int tail = arr.length - 1;
        for (int x = 0; x < center; x++) {
            int temp = arr[head];
            arr[head] = arr[tail];
            arr[tail] = temp;
            head++;
            tail--;
        }
        return arr;
    }


    /**
     * 多维数组
     *
     * @param arry
     * @return
     */
    public static int[][] reversalSort(int[][] arry) {
        for (int x = 0; x < arry.length; x++) {
            for (int y = x; y < arry[x].length; y++) {
                if (x != y) {
                    int temp = arry[x][y];
                    arry[x][y] = arry[y][x];
                    arry[y][x] = temp;
                }
            }
        }
        return arry;
    }

    public static void printArray(int[][] data) {
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data[x].length; y++) {
                System.out.print(data[x][y] + ",");
            }
            System.out.println();
        }
    }

}
