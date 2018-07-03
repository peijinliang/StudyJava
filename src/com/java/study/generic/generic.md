#����

1.ʲô�Ƿ��ͣ�û�з�����ǰ��ɶ�����ӣ�
������Java SE 1.5�������ԣ����͵ı����ǲ��������ͣ�Ҳ����˵���������������ͱ�ָ��Ϊһ��������
���ֲ������Ϳ��������ࡢ�ӿںͷ����Ĵ����У��ֱ��Ϊ�����ࡢ���ͽӿڡ����ͷ�����

2.���͵ĺô���ɶ��
Java�������뷺�͵ĺô��ǰ�ȫ�򵥡����Խ�����ʱ������ǰ������ʱ����

��Java SE 1.5֮ǰ��û�з��͵�������£�ͨ��������Object��������ʵ�ֲ����ġ����⻯����
�����⻯��������ȱ����Ҫ����ʽ��ǿ������ת����������ת����Ҫ�󿪷��߶�ʵ�ʲ������Ϳ���Ԥ֪������½��еġ�����ǿ������ת������������
���������ܲ���ʾ���������е�ʱ��ų����쳣������һ����ȫ���������͵ĺô����ڱ����ʱ�������Ͱ�ȫ���������е�ǿ��ת�������Զ�����ʽ�ģ���ߴ���������ʡ�

3.���͵�ʹ�÷�ʽ��ע�����


###������

���������ڸ�����Ķ��壬����Ϊ�����ࡣͨ�������������ɶ�һ����Ĳ������⿪����ͬ�Ľӿڡ�����͵ľ��Ǹ���
�����࣬�磺Lit��Set��Map��

    public class Generic<T> {
    
        //key�����Ա����������ΪT,T���������ⲿָ��
    
        private T key;
    
    
        public Generic(T key) { //���͹��췽���β�key������ҲΪT��T���������ⲿָ��
            this.key = key;
        }
    
    
        public T getKey() { //���ͷ���getKey�ķ���ֵ����ΪT��T���������ⲿָ��
            return key;
        }
    
    }

###���ͽӿ�

    //����һ�����ͽӿ�
    public interface GenericInterface<T> {
    
        public T next();
   
    }
   
    //ʵ�ָýӿ�
    public class FruitGenerator<T>  implements GenericInterface<T> {
       
           @Override
           public T next() {
               return null;
           }
    }
    
   
    //�������ǿ���ΪT����������ʵ�Σ��γ����������͵�Generator�ӿڡ�
    //��ʵ����ʵ�ַ��ͽӿ�ʱ�����ѽ��������ʹ���ʵ�����ͣ�������ʹ�÷��͵ĵط���Ҫ�滻�ɴ����ʵ������   
    public class FruitGenerator implements GenericInterface<String> {
    
        private String[] fruits = new String[]{"Apple", "Banana", "Pear"};
    
        @Override
        public String next() {
            Random rand = new Random();
            return fruits[rand.nextInt(3)];
        }
   
    }
    
    
###���ͷ���
ʲôҪʹ�÷��ͷ����أ�
���ͷ��������ڵ��÷�����ʱ��ָ�����͵ľ������͡�
1.������ʵ������ʱ��Ҫָ�����ͣ�����뻻һ�����ͣ���Ҫд�ܶ�Code �Ƚ��鷳��
2.ָ�����ͣ��������

       /**
         * ���ͷ���
         *
         * @param clazz �����������Ͷ���Class<T>,ָ������T�ľ�������
         * @param <T>   <T> �����˷���Ϊ���ͷ��������и�����T
         * @return T  ����T
         * @throws IllegalAccessException
         * @throws InstantiationException
         */
        public static <T> T getObject(Class<T> clazz) throws IllegalAccessException, InstantiationException {
            T object = clazz.newInstance();
            return object;
        }
    
        public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
            GenericMethod genericMethod = new GenericMethod();
            //java����
            User user = (User) getObject(Class.forName("com.java.study.generic.User"));
            System.out.println(user);
        }
 
    
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
    
            //�ڷ�������������һ�����ͷ�����ʹ�÷���E�����ַ���E����Ϊ�������͡�����������T��ͬ��Ҳ���Բ�ͬ��
            //���ڷ��ͷ�����������ʱ�����������<E>����˼�ʹ�ڷ������в�δ�������ͣ�������Ҳ�ܹ���ȷʶ���ͷ�����ʶ��ķ��͡�
    
            public <E> void show_3(E t){
                System.out.println(t.toString());
            }
    
            //�ڷ�������������һ�����ͷ�����ʹ�÷���T��ע�����T��һ��ȫ�µ����ͣ������뷺������������T����ͬһ�����͡�
    
            public <T> void show_2(T t){
                System.out.println(t.toString());
            }
    
        }
    
        public static void main(String[] args) {
            Apple apple = new Apple();
            Person person = new Person();
    
            GenerateTest<Fruit> generateTest = new GenerateTest<Fruit>();
            //apple��Fruit�����࣬�����������
            generateTest.show_1(apple);
            //�������ᱨ����Ϊ��������ʵ��ָ������Fruit���������ʵ������Person
            //generateTest.show_1(person);
    
            //ʹ�����������������Գɹ�
            generateTest.show_2(apple);
            generateTest.show_2(person);
    
            //ʹ������������Ҳ�����Գɹ�
            generateTest.show_3(apple);
            generateTest.show_3(person);
    
        }
    }

    

###����ͨ���
ͨ�������δ֪���͡�

��  ���Դ���ͬ���͵Ĳ���

�������ڲ�����
��  extends  �ࣺ  ���÷������ޣ��༰�����ࣩ
��  extends  Number   ���磺 int double


ֻ�����ڷ���������
?  super  �ࣺ  ���÷������ޣ��༰�丸�ࣩ
?  super  String  ���磺String �� Object






    






