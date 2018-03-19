package com.java.study.nio;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/**
 * Crete by Marlon
 * Create Date: 2018/3/19
 * Class Describe
 **/
public class NioBuffer {


    public static void main(String[] args) {



    }


    /**
     * FloatBuffer ����ʹ��
     */
    public void FloatBufferOperation() {
        // ����FloatBuffer������10,��λ float��Ҳ����˵������ buffer �ŵ���10�� float
        FloatBuffer buffer = FloatBuffer.allocate(10);

        //allocate  ����
        for (int i = 0; i < buffer.capacity(); ++i) {
            float f = (float) Math.sin((((float) i) / 10) * (2 * Math.PI));
            buffer.put(f); // position ++
        }

        buffer.flip(); // position = 0  ��ת������

        //Remaining ʣ���
        while (buffer.hasRemaining()) {
            float f = buffer.get(); // position ++
            System.out.println(f);
        }
    }
}
