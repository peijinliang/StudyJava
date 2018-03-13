package com.java.study.datastructure.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Crete by Marlon
 * Create Date: 2018/3/13
 * Class Describe
 * Map ����Ҫ�ľ��ǲ�ѯ����
 * HashMap��HashTable��TreeMap�����򣩡�ConcurrentHashMap
 * HashMap ԭ��
 * ������������������
 * ������С��ʱ��HashMap����������д洢�ģ����������Ϊ�˽��п��ٵĲ��ң�Map������ú����������������� HashCode�������ݶ�λ��
 * <p>
 * 16��֮ǰ ��ͳ��˾
 * 16���Ժ� ��������˾
 **/
public class SMap {

    public static void main(String[] args) {
        /**
         * HashMap �첽�����̷߳��ʣ��̲߳���ȫ��
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Php");
        map.put(3, ".net");
        map.put(2, "Pythony");  //�ظ�����
        map.put(3, "Go");       //�ظ�����
        map.put(4, null);
        System.out.println(map);

        Set<Map.Entry<Integer, String>> sets = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = sets.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> me = iterator.next();
            System.out.println(me.getKey() + "  " + me.getValue());
        }

        //��ȡȫ��Key����Ϣ
        Set<Integer> set = map.keySet();
        Iterator<Integer> inter = set.iterator();
        while (inter.hasNext()) {
            System.out.println(inter.next() + "  value = " + map.get(inter.next()));
        }

        /**
         * HashTable  ��Ԫż��������ݽṹ
         * jdk 1.0�Ƴ�  �̰߳�ȫ�͡����ܽϵ�   key��Value������Ϊ��
         * ���̰߳�ȫ,����Ч�ʵ�
         */
        Map<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "Java");
        hashTable.put(2, "Php");
        hashTable.put(3, "6666");
        hashTable.put(5, "9999");
//      hashTable.put(10, null); ����Ϊ��

        /**
         * ConcurrentHashMap
         * ������ HashTable�̰߳�ȫ �� HashMap�����ܵ��ŵ�
         * ִ�ж���߳�ͬ�����ݸ����ֿ��Ա�֤�ܸߵ�ִ��Ч��
         * Concurrent ������
         */
        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "Java");
        concurrentHashMap.put(2, "Php");
        concurrentHashMap.put(3, "6666");
        concurrentHashMap.put(5, "9999");
//      concurrentHashMap.put(10, null);
        System.out.println(concurrentHashMap);

        /**
         * ���ݷ�Ͱ
         * �ô�: ���� ���µ�ʱ��ֻ��һ�����ݣ��������������ʣ�����ͨ�����ַ��������ִ��Ч��
         */
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Random random = new Random();
                int temp = random.nextInt(9999);
                int result = temp % 3;
                switch (result) {
                    case 0:
                        System.out.println("[��һͰ]" + temp);
                        break;
                    case 1:
                        System.out.println("[�ڶ�Ͱ]" + temp);
                        break;
                    case 2:
                        System.out.println("[����Ͱ]" + temp);
                        break;
                }

            }).start();

        }

        HashMap<String, SPerson> hash1 = new HashMap<>();
        hash1.put(new String("110"), new SPerson("����"));
        System.out.println(hash1.get(new String("110")));


        //��Ҫ��д HashCode �� equals����
        HashMap<SPerson, String> hash2 = new HashMap<>();
        hash2.put(new SPerson("����"), new String("�Ի�"));
        System.out.println(hash2.get(new SPerson("����")));


        //ͨ��Comparable������������
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "С��");
        treeMap.put(4, "С��");
        treeMap.put(0, "marlon");
        treeMap.put(3, "�Nɪ");
        System.out.println(treeMap);

        /**
         * SPerson
         */
        HashMap<SPerson, String> hash3 = new HashMap<>();
        hash3.put(new SPerson("2222"), new String("����"));
        hash3.put(new SPerson("111"), new String("�Ի�"));
        System.out.println(hash3);
    }


}
