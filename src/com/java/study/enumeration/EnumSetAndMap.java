package com.java.study.enumeration;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe
 **/

public class EnumSetAndMap {


    public static void main(String[] args) {

        System.out.println("时薪100的人在周五工作8小时的收入：" + PayrollDay.FRIDAY.pay(8.0, 100));
        System.out.println("时薪100的人在周六工作8小时的收入：" + PayrollDay.SATURDAY.pay(8.0, 100));

        // EnumSet的使用
        System.out.println("EnumSet展示");
        EnumSet<ErrorCodeEn> errSet = EnumSet.allOf(ErrorCodeEn.class);

        for (ErrorCodeEn e : errSet) {
            System.out.println(e.name() + " : " + e.ordinal());
        }

        // EnumMap的使用
        System.out.println("EnumMap展示");
        EnumMap<StateMachine.Signal, String> errMap = new EnumMap(StateMachine.Signal.class);
        errMap.put(StateMachine.Signal.RED, "红灯");
        errMap.put(StateMachine.Signal.YELLOW, "黄灯");
        errMap.put(StateMachine.Signal.GREEN, "绿灯");
        for (Iterator<Map.Entry<StateMachine.Signal, String>> iter = errMap.entrySet().iterator(); iter.hasNext(); ) {
            Map.Entry<StateMachine.Signal, String> entry = iter.next();
            System.out.println(entry.getKey().name() + " : " + entry.getValue());
        }

    }


}
