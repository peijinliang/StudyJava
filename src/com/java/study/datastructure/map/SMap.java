package com.java.study.datastructure.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Crete by Marlon
 * Create Date: 2018/3/13
 * Class Describe
 * Map 最主要的就是查询数据
 * HashMap、HashTable、TreeMap（排序）、ConcurrentHashMap
 * HashMap 原理：
 * 均衡二叉树、红黑书概念。
 * 数据量小的时候HashMap进行链表进行存储的；数据量变大，为了进行快速的查找，Map链表采用红黑树（均衡二叉树） HashCode进行数据定位。
 * <p>
 * 16年之前 传统公司
 * 16年以后 互联网公司
 **/
public class SMap {

    public static void main(String[] args) {
        /**
         * HashMap 异步，多线程访问，线程不安全。
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Php");
        map.put(3, ".net");
        map.put(2, "Pythony");  //重复覆盖
        map.put(3, "Go");       //重复覆盖
        map.put(4, null);
        System.out.println(map);

        Set<Map.Entry<Integer, String>> sets = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = sets.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> me = iterator.next();
            System.out.println(me.getKey() + "  " + me.getValue());
        }

        //获取全部Key的信息
        Set<Integer> set = map.keySet();
        Iterator<Integer> inter = set.iterator();
        while (inter.hasNext()) {
            System.out.println(inter.next() + "  value = " + map.get(inter.next()));
        }

        /**
         * HashTable  二元偶对象的数据结构
         * jdk 1.0推出  线程安全型、性能较低   key和Value不允许为空
         * 多线程安全,但是效率低
         */
        Map<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "Java");
        hashTable.put(2, "Php");
        hashTable.put(3, "6666");
        hashTable.put(5, "9999");
//      hashTable.put(10, null); 不能为空

        /**
         * ConcurrentHashMap
         * 集合了 HashTable线程安全 和 HashMap高性能的优点
         * 执行多个线程同步数据更新又可以保证很高的执行效率
         * Concurrent 并发包
         */
        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "Java");
        concurrentHashMap.put(2, "Php");
        concurrentHashMap.put(3, "6666");
        concurrentHashMap.put(5, "9999");
//      concurrentHashMap.put(10, null);
        System.out.println(concurrentHashMap);

        /**
         * 数据分桶
         * 好处: 类中 更新的时候只锁一条数据，其他的正常访问，就是通过这种方法来提高执行效率
         */
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Random random = new Random();
                int temp = random.nextInt(9999);
                int result = temp % 3;
                switch (result) {
                    case 0:
                        System.out.println("[第一桶]" + temp);
                        break;
                    case 1:
                        System.out.println("[第二桶]" + temp);
                        break;
                    case 2:
                        System.out.println("[第三桶]" + temp);
                        break;
                }

            }).start();

        }

        HashMap<String, SPerson> hash1 = new HashMap<>();
        hash1.put(new String("110"), new SPerson("张三"));
        System.out.println(hash1.get(new String("110")));


        //需要复写 HashCode 和 equals方法
        HashMap<SPerson, String> hash2 = new HashMap<>();
        hash2.put(new SPerson("张三"), new String("吃货"));
        System.out.println(hash2.get(new SPerson("张三")));


        //通过Comparable方法进行排序
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "小明");
        treeMap.put(4, "小红");
        treeMap.put(0, "marlon");
        treeMap.put(3, "嘚瑟");
        System.out.println(treeMap);

        /**
         * SPerson
         */
        HashMap<SPerson, String> hash3 = new HashMap<>();
        hash3.put(new SPerson("2222"), new String("花痴"));
        hash3.put(new SPerson("111"), new String("吃货"));
        System.out.println(hash3);
    }


}
