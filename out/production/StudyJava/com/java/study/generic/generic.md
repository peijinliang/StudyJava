#泛型

1.什么是泛型，没有泛型以前是啥子样子？
泛型是Java SE 1.5的新特性，泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
这种参数类型可以用在类、接口和方法的创建中，分别称为泛型类、泛型接口、泛型方法。

2.泛型的好处是啥？
Java语言引入泛型的好处是安全简单。可以将运行时错误提前到编译时错误。

在Java SE 1.5之前，没有泛型的情况的下，通过对类型Object的引用来实现参数的“任意化”，
“任意化”带来的缺点是要做显式的强制类型转换，而这种转换是要求开发者对实际参数类型可以预知的情况下进行的。对于强制类型转换错误的情况，
编译器可能不提示错误，在运行的时候才出现异常，这是一个安全隐患。泛型的好处是在编译的时候检查类型安全，并且所有的强制转换都是自动和隐式的，提高代码的重用率。

3.泛型的使用方式，注意事项？


###泛型类

泛型类用于各种类的定义，被称为泛型类。通过泛型类可以完成对一组类的操作对外开放相同的接口。最典型的就是各种
容器类，如：Lit、Set、Map。

    public class Generic<T> {
    
        //key这个成员变量的类型为T,T的类型由外部指定
    
        private T key;
    
    
        public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
            this.key = key;
        }
    
    
        public T getKey() { //泛型方法getKey的返回值类型为T，T的类型由外部指定
            return key;
        }
    
    }

###泛型接口

    //定义一个泛型接口
    public interface GenericInterface<T> {
    
        public T next();
   
    }
   
    //实现该接口
    public class FruitGenerator<T>  implements GenericInterface<T> {
       
           @Override
           public T next() {
               return null;
           }
    }
    
   
    //但是我们可以为T传入无数个实参，形成无数种类型的Generator接口。
    //在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型   
    public class FruitGenerator implements GenericInterface<String> {
    
        private String[] fruits = new String[]{"Apple", "Banana", "Pear"};
    
        @Override
        public String next() {
            Random rand = new Random();
            return fruits[rand.nextInt(3)];
        }
   
    }
    
    
###泛型方法
什么要使用泛型方法呢？
泛型方法，是在调用方法的时候指明泛型的具体类型。
1.泛型在实例化的时候要指明类型，如果想换一种类型，需要写很多Code 比较麻烦，
2.指明类型，更加灵活

       /**
         * 泛型方法
         *
         * @param clazz 用来创建泛型对象，Class<T>,指明泛型T的具体类型
         * @param <T>   <T> 声明此方法为泛型方法，且有个类型T
         * @return T  泛型T
         * @throws IllegalAccessException
         * @throws InstantiationException
         */
        public static <T> T getObject(Class<T> clazz) throws IllegalAccessException, InstantiationException {
            T object = clazz.newInstance();
            return object;
        }
    
        public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
            GenericMethod genericMethod = new GenericMethod();
            //java泛型
            User user = (User) getObject(Class.forName("com.java.study.generic.User"));
            System.out.println(user);
        }
 
    
    public class GenericTest {
    
        /**
         * 这个类是个泛型类，在上面已经介绍过
         *
         * @param <T>
         */
        public class Generic<T> {
            private T key;
    
            public Generic(T key) {
                this.key = key;
            }
    
            //我想说的其实是这个，虽然在方法中使用了泛型，但是这并不是一个泛型方法。
            //这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。
            //所以在这个方法中才可以继续使用 T 这个泛型。
    
            public T getKey() {
                return key;
            }
    
    
            /**
             * 这个方法显然是有问题的，在编译器会给我们提示这样的错误信息"cannot reslove symbol E"
             * 因为在类的声明中并未声明泛型E，所以在使用E做形参和返回值类型时，编译器会无法识别。
             */
    //        public E setKey(E key){
    //            this.key = keu
    //        }
    
        }
    
        /**
         * 这才是一个真正的泛型方法。
         * 首先在public与返回值之间的<T>必不可少，这表明这是一个泛型方法，并且声明了一个泛型T
         * 这个T可以出现在这个泛型方法的任意位置.
         * 泛型的数量也可以为任意多个
         */
    //    public <T,K> K showKeyName(Generic<T> container){
    //             // do something
    //     }
    //
    
    
        public <T> T showKeyName(Generic<T> container) {
            System.out.println("container key :" + container.getKey());
            //当然这个例子举的不太合适，只是为了说明泛型方法的特性
            T test = container.getKey();
            return test;
        }
    
        //这也不是一个泛型方法，这就是一个普通的方法，只是使用了Generic<Number>这个泛型类做形参而已。
    
        public void showKeyValue1(Generic<Number> obj) {
            System.out.println("泛型测试 key value is " + obj.getKey());
        }
    
        //这也不是一个泛型方法，这也是一个普通的方法，只不过使用了泛型通配符?
        //同时这也印证了泛型通配符章节所描述的，?是一种类型实参，可以看做为Number等所有类的父类
    
        public void showKeyValue2(Generic<?> obj) {
            System.out.println("泛型测试 key value is " + obj.getKey());
        }
    
        /**
         * 这个方法是有问题的，编译器会为我们提示错误信息："UnKnown class 'E' "
         * 虽然我们声明了<T>,也表明了这是一个可以处理泛型的类型的泛型方法。
         * 但是只声明了泛型类型T，并未声明泛型类型E，因此编译器并不知道该如何处理E这个类型。
         */
    //    public <T> T showKeyName(Generic<E> container){
    //     ...
    //    }
    
    
        /**
         * 这个方法也是有问题的，编译器会为我们提示错误信息："UnKnown class 'T' "
         * 对于编译器来说T这个类型并未项目中声明过，因此编译也不知道该如何编译这个类。
         * 所以这也不是一个正确的泛型方法声明。
         */
    //    public void showkey(T genericObj){
    //
    //    }
    
    
    }
    
    
    public class GenericFruit {
    
        static class Fruit{
            @Override
            public String toString() {
                return "fruit";
            }
        }
    
        static class Apple extends Fruit{
            @Override
            public String toString() {
                return "apple";
            }
        }
    
        static class Person{
            @Override
            public String toString() {
                return "Person";
            }
        }
    
        static class GenerateTest<T>{
    
            public void show_1(T t){
                System.out.println(t.toString());
            }
    
            //在泛型类中声明了一个泛型方法，使用泛型E，这种泛型E可以为任意类型。可以类型与T相同，也可以不同。
            //由于泛型方法在声明的时候会声明泛型<E>，因此即使在泛型类中并未声明泛型，编译器也能够正确识别泛型方法中识别的泛型。
    
            public <E> void show_3(E t){
                System.out.println(t.toString());
            }
    
            //在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
    
            public <T> void show_2(T t){
                System.out.println(t.toString());
            }
    
        }
    
        public static void main(String[] args) {
            Apple apple = new Apple();
            Person person = new Person();
    
            GenerateTest<Fruit> generateTest = new GenerateTest<Fruit>();
            //apple是Fruit的子类，所以这里可以
            generateTest.show_1(apple);
            //编译器会报错，因为泛型类型实参指定的是Fruit，而传入的实参类是Person
            //generateTest.show_1(person);
    
            //使用这两个方法都可以成功
            generateTest.show_2(apple);
            generateTest.show_2(person);
    
            //使用这两个方法也都可以成功
            generateTest.show_3(apple);
            generateTest.show_3(person);
    
        }
    }

    

###泛型通配符
通配符来表未知类型。

？  可以代表不同类型的参数

可以用在参数上
？  extends  类：  设置泛型上限（类及其子类）
？  extends  Number   例如： int double


只能用在方法声明上
?  super  类：  设置泛型下限（类及其父类）
?  super  String  例如：String 和 Object






    






