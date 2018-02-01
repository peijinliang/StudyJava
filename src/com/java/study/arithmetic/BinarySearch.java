package com.java.study.arithmetic;

/**
 * ���ֲ���
 * ǰ�᣺���ֲ��ҽ�������
 * �߼�˼άѵ��
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int search = 8;
//        index(data, search);
        int x = binarySearch(data, 0, data.length - 1, search);
        System.out.println(x);
    }

    //��ͨ���ҷ���
    public static int index(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * �����ݹ���в���
     *
     * @param arr
     * @param key
     * @return
     */
    public static int binarySearch(int[] arr, int from, int to, int key) {
        int mid = from / 2 + to / 2;  //ȷ���м��
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
