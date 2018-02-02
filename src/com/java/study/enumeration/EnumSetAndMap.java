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

        System.out.println("ʱн100���������幤��8Сʱ�����룺" + PayrollDay.FRIDAY.pay(8.0, 100));
        System.out.println("ʱн100��������������8Сʱ�����룺" + PayrollDay.SATURDAY.pay(8.0, 100));

        // EnumSet��ʹ��
        System.out.println("EnumSetչʾ");
        EnumSet<ErrorCodeEn> errSet = EnumSet.allOf(ErrorCodeEn.class);

        for (ErrorCodeEn e : errSet) {
            System.out.println(e.name() + " : " + e.ordinal());
        }

        // EnumMap��ʹ��
        System.out.println("EnumMapչʾ");
        EnumMap<StateMachine.Signal, String> errMap = new EnumMap(StateMachine.Signal.class);
        errMap.put(StateMachine.Signal.RED, "���");
        errMap.put(StateMachine.Signal.YELLOW, "�Ƶ�");
        errMap.put(StateMachine.Signal.GREEN, "�̵�");
        for (Iterator<Map.Entry<StateMachine.Signal, String>> iter = errMap.entrySet().iterator(); iter.hasNext(); ) {
            Map.Entry<StateMachine.Signal, String> entry = iter.next();
            System.out.println(entry.getKey().name() + " : " + entry.getValue());
        }

    }


}
