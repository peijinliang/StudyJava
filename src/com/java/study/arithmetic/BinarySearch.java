package com.java.study.arithmetic;

/**
 * 二分查找
 * 前提：二分查找进行排序
 * 逻辑思维训练
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int search = 8;
//        index(data, search);
        int x = binarySearch(data, 0, data.length - 1, search);
        System.out.println(x);
    }

    //普通查找方法
    public static int index(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 方法递归进行操作
     *
     * @param arr
     * @param key
     * @return
     */
    public static int binarySearch(int[] arr, int from, int to, int key) {
        int mid = from / 2 + to / 2;  //确定中间点
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            binarySearch(arr, from, mid - 1, key);
        } else if (arr[mid] < key) {
            binarySearch(arr, mid + 1, to, key);
        }
        return -1;
    }

}
