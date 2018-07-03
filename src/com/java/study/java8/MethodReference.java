package com.java.study.java8;

/**
 * ��������:���ʾ��Ǳ�����ʵ����Ҳ���Ǳ�����ʹ��
 * ���þ�̬������������ :: static ��������
 * ����ĳ������ķ����� ʵ��������:: ��ͨ����
 * ����ĳ���ض���ķ����� ������:: ��ͨ����
 * ���ù��췽�� :  ������ :: new
 * <p>
 * ����Ҫ���ú���ʽ�ӿ����
 * ��Lambda��һ������
 */

public class MethodReference {

    @FunctionalInterface
    public interface IUtil<P, R> {
        public R zhuanhuan(P p);
    }

    @FunctionalInterface
    public interface UpperCase<R> {
        public R zhuanhuan();
    }

    @FunctionalInterface
    public interface CompareTo<R, P> {
        public R comptTo(P p1, P p2);
    }

    @FunctionalInterface
    public interface PersonUtil<R, FP, SP> {
        public R create(FP fp, SP sp);
    }

    public static void main(String[] args) {
        IUtil<Integer, String> ui = (p1) -> String.valueOf(p1);  //�������Ϊ
        IUtil<Integer, String> iu = String::valueOf;  //���з�������
        String str = iu.zhuanhuan(1000);
        System.out.println("�ַ������ȣ�" + str.length());

        //��ǰ��д��
        UpperCase<String> upper = new UpperCase<String>() {
            @Override
            public String zhuanhuan() {

                return "Hello".toUpperCase();
            }
        };

        UpperCase<String> Case = () -> "Hello".toUpperCase();

        //���ڵ�д��
        UpperCase<String> upperCase = "Hello"::toUpperCase;
        System.out.println(upperCase.zhuanhuan());

        //��������
        CompareTo<Integer, String> compareTo = String::compareTo;
        System.out.println(compareTo.comptTo("H", "A"));

        PersonUtil<Person, String, Integer> personUtil = Person::new;
        System.out.println(personUtil.create("С��", 20));
    }

}
