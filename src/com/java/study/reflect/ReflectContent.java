package com.java.study.reflect;

import java.lang.reflect.*;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: ${ DATE }
 * Class Describe  study 反射和映射
 **/

public class ReflectContent {

    public static void main(String[] args) {

        try {

            Class className = Class.forName("com.java.study.reflect.Person");
            //即获取类名 又获取包名
            System.out.println("Name:" + className.getName());
            //仅仅获取类名 不获取包名
            System.out.println("SimpleName:" + className.getSimpleName());
            //获取类的 Modifiers 修饰符
            int modifiers = className.getModifiers();
            System.out.println("类是否为抽象的:" + Modifier.isAbstract(modifiers));
            System.out.println("是否用Final修饰:" + Modifier.isFinal(modifiers));
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

            //获取包的信息
            System.out.println("包名：" + hero.getName());
            //获取父类信息 (然后可以获取父类的信息)
            System.out.println("Class 对象你可以访问类的父类：" + hero.getSuperclass().getName());
            //类的接口
            Class[] interfaces = className.getInterfaces();
            if (interfaces.length > 0) {
                System.out.println("集成接口的名字：" + interfaces[0].getName());
            }

            //根据 Class 对象来获取 Constructor 类
            Constructor[] constructors = className.getConstructors();
            if (constructors.length > 0) {
                Class[] parameterTypes = constructors[0].getParameterTypes();
                System.out.println("构造参数数组：" + parameterTypes[0]);
            }

//          Method method = className.getMethod("setName", String.class);
//          Object returnValue = method.invoke(null, "你说你嘚瑟啥");

            //采用反射返回一个字段的值
            Field[] fields = className.getFields();
            Person person = new Person("小明");
            Field privateStringField = Person.class.getDeclaredField("name");
            //setAccessible()方法会关闭指定类 Field 实例的反射访问检查，这行代码执行之后不论是私有的、受保护的以及包访问的作用域，
            // 你都可以在任何地方访问，即使你不在他的访问权限作用域之内。但是你如果你用一般代码来访问这些不在你权限作用域之内的代码依然是不可以的，
            // 在编译的时候就会报错。
            privateStringField.setAccessible(true);
            String fieldValue = (String) privateStringField.get(person);
            System.out.println("fieldValue = " + fieldValue);


            //根据字段 返回一个私有方法
            Person person2 = new Person("小明", "The Private Value");
            Method privateStringMethod = Person.class.getDeclaredMethod("getPrivateString", null);
            privateStringMethod.setAccessible(true);
            String returnValue = (String) privateStringMethod.invoke(person2, null);
            System.out.println("returnValue = " + returnValue);

            //反射中的类型
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
