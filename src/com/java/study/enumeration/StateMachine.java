package com.java.study.enumeration;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe
 **/
public class StateMachine {
    enum Signal {
        RED, GREEN,YELLOW;
    }





    //ö�����͵�״̬�� �ɶ��ԱȽϺ�
    private String getTrafficInstruct(Signal signal) {
        String instruct = "�źŵƹ���";
        switch (signal) {
            case RED:
                instruct = "���ͣ";
                break;
            case GREEN:
                instruct = "�Ƶ���ע��";
                break;
            case YELLOW:
                instruct = "�Ƶ���ע��";
                break;
            default:
                break;
        }
        return instruct;
    }



}
