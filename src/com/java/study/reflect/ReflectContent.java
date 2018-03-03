package com.java.study.reflect;

import java.lang.reflect.*;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: ${ DATE }
 * Class Describe  study �����ӳ��
 **/

public class ReflectContent {

    public static void main(String[] args) {

        try {

            Class className = Class.forName("com.java.study.reflect.Person");
            //����ȡ���� �ֻ�ȡ����
            System.out.println("Name:" + className.getName());
            //������ȡ���� ����ȡ����
            System.out.println("SimpleName:" + className.getSimpleName());
            //��ȡ��� Modifiers ���η�
            int modifiers = className.getModifiers();
            System.out.println("���Ƿ�Ϊ�����:" + Modifier.isAbstract(modifiers));
            System.out.println("�Ƿ���Final����:" + Modifier.isFinal(modifiers));
            System.out.println("isInterface:" + Modifier.isInterface(modifiers));
            System.out.println("isNative:" + Modifier.isNative(modifiers));
            System.out.println("isPrivate:" + Modifier.isPrivate(modifiers));
            System.out.println("isProtected:" + Modifier.isProtected(modifiers));
            System.out.println("isPublic:" + Modifier.isPublic(modifiers));
            System.out.println("isStatic:" + Modifier.isStatic(modifiers));
            System.out.println("isStrict:" + Modifier.isStrict(modifiers));
            System.out.println("isSynchronized:" + Modifier.isSynchronized(modifiers));
            System.out.println("isTransient:" + Modifier.isTransient(modifiers));
            System.out.println("isVolatile:" + Modifier.isVolatile(modifiers));

            Class hero = Class.forName("com.java.study.reflect.Hero");

            //��ȡ������Ϣ
            System.out.println("������" + hero.getName());
            //��ȡ������Ϣ (Ȼ����Ի�ȡ�������Ϣ)
            System.out.println("Class ��������Է�����ĸ��ࣺ" + hero.getSuperclass().getName());
            //��Ľӿ�
            Class[] interfaces = className.getInterfaces();
            if (interfaces.length > 0) {
                System.out.println("���ɽӿڵ����֣�" + interfaces[0].getName());
            }

            //���� Class ��������ȡ Constructor ��
            Constructor[] constructors = className.getConstructors();
            if (constructors.length > 0) {
                Class[] parameterTypes = constructors[0].getParameterTypes();
                System.out.println("����������飺" + parameterTypes[0]);
            }

//          Method method = className.getMethod("setName", String.class);
//          Object returnValue = method.invoke(null, "��˵��Nɪɶ");

            //���÷��䷵��һ���ֶε�ֵ
            Field[] fields = className.getFields();
            Person person = new Person("С��");
            Field privateStringField = Person.class.getDeclaredField("name");
            //setAccessible()������ر�ָ���� Field ʵ���ķ�����ʼ�飬���д���ִ��֮������˽�еġ��ܱ������Լ������ʵ�������
            // �㶼�������κεط����ʣ���ʹ�㲻�����ķ���Ȩ��������֮�ڡ��������������һ�������������Щ������Ȩ��������֮�ڵĴ�����Ȼ�ǲ����Եģ�
            // �ڱ����ʱ��ͻᱨ��
            privateStringField.setAccessible(true);
            String fieldValue = (String) privateStringField.get(person);
            System.out.println("fieldValue = " + fieldValue);


            //�����ֶ� ����һ��˽�з���
            Person person2 = new Person("С��", "The Private Value");
            Method privateStringMethod = Person.class.getDeclaredMethod("getPrivateString", null);
            privateStringMethod.setAccessible(true);
            String returnValue = (String) privateStringMethod.invoke(person2, null);
            System.out.println("returnValue = " + returnValue);

            //�����е�����
            Method method = Person.class.getMethod("getStringList", null);
            Type returnType = method.getGenericReturnType();
            if (returnType instanceof ParameterizedType) {
                ParameterizedType type = (ParameterizedType) returnType;
                Type[] typeArgument = type.getActualTypeArguments();
                for (Type typeItem : typeArgument) {
                    Class typeArgClass = (Class) typeItem;
                    System.out.println("typeArgClass = " + typeArgClass);
                }
            }

            Method method2 = Person.class.getMethod("setStringList", List.class);
            Type[] genericParameterTypes = method2.getGenericParameterTypes();
            for (Type genericParameterType : genericParameterTypes) {
                if (genericParameterType instanceof ParameterizedType) {
                    ParameterizedType aType = (ParameterizedType) genericParameterType;
                    Type[] parameterArgTypes = aType.getActualTypeArguments();
                    for (Type parameterArgType : parameterArgTypes) {
                        Class parameterArgClass = (Class) parameterArgType;
                        System.out.println("parameterArgClass = " + parameterArgClass);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }



}
