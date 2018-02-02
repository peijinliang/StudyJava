1、线程本身就是一个进程进行资源分配和CPU分配的过程
2、Thread 中的 start0()方法  对JVM虚拟机进行资源的分配
3、Thread 和  Runnable  实际上即使 都是在run（）方法写具体的业务逻辑
4、 线程有就绪状态   阻塞状态  运行状态

java.util.concurrent;  这个包是实际中进行高并发编程的jar包。
Runnable 接口和  Callable<T>  接口最大的区别就是一个有返回值，一个没有返回值。



线程的同步和死锁
轮番抢占资源带来的问题