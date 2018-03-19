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
     * FloatBuffer 操作使用
     */
    public void FloatBufferOperation() {
        // 创建FloatBuffer，容量10,单位 float，也就是说创建的 buffer 放的下10个 float
        FloatBuffer buffer = FloatBuffer.allocate(10);

        //allocate  分配
        for (int i = 0; i < buffer.capacity(); ++i) {
            float f = (float) Math.sin((((float) i) / 10) * (2 * Math.PI));
            buffer.put(f); // position ++
        }

        buffer.flip(); // position = 0  反转缓冲区

        //Remaining 剩余的
        while (buffer.hasRemaining()) {
            float f = buffer.get(); // position ++
            System.out.println(f);
        }
    }
}
