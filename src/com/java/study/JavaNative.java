package com.java.study;

/**
 * Crete by Marlon
 * Create Date: 12/1/2017
 * Class Describe
 * native�ؼ���˵�������εķ�����һ��ԭ��̬����
 * Java���Ա����ܶԲ���ϵͳ�ײ���з��ʺͲ��������ǿ���ͨ��JNI�ӿڵ�������������ʵ�ֶԵײ�ķ��ʡ�
 * JNI java native interface
 **/

public class JavaNative {

    public native void hello();

    static {
        System.loadLibrary("hello");
    }


    public static void main(String[] args) {
        new JavaNative().hello();
    }



}
