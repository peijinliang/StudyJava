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





    //枚举类型的状态机 可读性比较好
    private String getTrafficInstruct(Signal signal) {
        String instruct = "信号灯故障";
        switch (signal) {
            case RED:
                instruct = "红灯停";
                break;
            case GREEN:
                instruct = "黄灯请注意";
                break;
            case YELLOW:
                instruct = "黄灯请注意";
                break;
            default:
                break;
        }
        return instruct;
    }



}
