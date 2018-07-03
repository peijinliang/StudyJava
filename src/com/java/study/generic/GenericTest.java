package com.java.study.generic;

/**
 * Crete by Marlon
 * Create Date: 2018/7/3
 * Class Describe
 **/
public class GenericTest {

    /**
     * ������Ǹ������࣬�������Ѿ����ܹ�
     *
     * @param <T>
     */
    public class Generic<T> {
        private T key;

        public Generic(T key) {
            this.key = key;
        }

        //����˵����ʵ���������Ȼ�ڷ�����ʹ���˷��ͣ������Ⲣ����һ�����ͷ�����
        //��ֻ������һ����ͨ�ĳ�Ա������ֻ�������ķ���ֵ���������������Ѿ��������ķ��͡�
        //��������������вſ��Լ���ʹ�� T ������͡�

        public T getKey() {
            return key;
        }

        /**
         * ���������Ȼ��������ģ��ڱ��������������ʾ�����Ĵ�����Ϣ"cannot reslove symbol E"
         * ��Ϊ����������в�δ��������E��������ʹ��E���βκͷ���ֵ����ʱ�����������޷�ʶ��
         */
//        public E setKey(E key){
//            this.key = keu
//        }
    }

    /**
     * �����һ�������ķ��ͷ�����
     * ������public�뷵��ֵ֮���<T>�ز����٣����������һ�����ͷ���������������һ������T
     * ���T���Գ�����������ͷ���������λ��.
     * ���͵�����Ҳ����Ϊ������
     */
//    public <T,K> K showKeyName(Generic<T> container){
//             // do something
//     }
//


    public <T> T showKeyName(Generic<T> container) {
        System.out.println("container key :" + container.getKey());
        //��Ȼ������ӾٵĲ�̫���ʣ�ֻ��Ϊ��˵�����ͷ���������
        T test = container.getKey();
        return test;
    }

    //��Ҳ����һ�����ͷ����������һ����ͨ�ķ�����ֻ��ʹ����Generic<Number>������������βζ��ѡ�

    public void showKeyValue1(Generic<Number> obj) {
        System.out.println("���Ͳ��� key value is " + obj.getKey());
    }

    //��Ҳ����һ�����ͷ�������Ҳ��һ����ͨ�ķ�����ֻ����ʹ���˷���ͨ���?
    //ͬʱ��Ҳӡ֤�˷���ͨ����½��������ģ�?��һ������ʵ�Σ����Կ���ΪNumber��������ĸ���

    public void showKeyValue2(Generic<?> obj) {
        System.out.println("���Ͳ��� key value is " + obj.getKey());
    }

    /**
     * ���������������ģ���������Ϊ������ʾ������Ϣ��"UnKnown class 'E' "
     * ��Ȼ����������<T>,Ҳ����������һ�����Դ����͵����͵ķ��ͷ�����
     * ����ֻ�����˷�������T����δ������������E����˱���������֪������δ���E������͡�
     */
//    public <T> T showKeyName(Generic<E> container){
//     ...
//    }

    /**
     * �������Ҳ��������ģ���������Ϊ������ʾ������Ϣ��"UnKnown class 'T' "
     * ���ڱ�������˵T������Ͳ�δ��Ŀ������������˱���Ҳ��֪������α�������ࡣ
     * ������Ҳ����һ����ȷ�ķ��ͷ���������
     */
//    public void showkey(T genericObj){
//
//    }


}
