
java Nio之前都是标准的I/O 系统都是基于Byte（字节）和Stream（数据流）的，相应的I/O 操
作都是阻塞型的，所以服务器程序也采用阻塞型I/O 进行数据的读、写操作。

有点：模式的优点是简单、实用、易管理
缺点：
1）由于是为每一个客户端分配一个线程来处理输入、输出数据，其线程与客户机的比例近似为1：1，随着线程
数量的不断增加，服务器启动了大量的并发线程，会大大加大系统对线程的管理开销，这将
成为吞吐量瓶颈的主要原因；
2）其次由于底层的I/O 操作采用的同步模式，I/O 操作的阻塞管
理粒度是以服务于请求的线程为单位的,有可能大量的线程会闲置,处于盲等状态，造成I/O
资源利用率不高，影响整个系统的性能

java Nio 概念？
本身是javaI/O的改进

NIO 工具包提出了基于Buffer（缓冲区）、Channel（通道）、Selector（选择器）的新模式；
Selector（选择器）、可选择的Channel（通道）和 SelectionKey（选择键）配合起来使用，可以实现并发的非阻塞型I/O 能力

Buffer抽象类 (缓冲类)
1)七个子类 ByteBuffer、CharBuffer、DoubleBuffer、FloatBuffer、IntBuffer、LongBuffer和ShortBuffer。
2）每一个Buffer对象相当于一个数据容器，可以把它看做内存中的一个大的数组，用来存储基本数据类型的数据。
3）Buffer的核心是一块内存区域，可以对其执行内存有关的操作，利用操作系统的特性和能力提高和改善JAVA传统NIO的性能。

Channel (通道)
1）是(Buffer)缓冲器和I/O 服务之间的通道，
2）具有双向性，既可以读入也可以写出，可以更高效的传递数据。


Selector（选择器）和SelectionKey（选择键）
1)Buffer 是数据的容器对象;各类Channel 实现在各类Buffer 与各类I/O 服务间传输数据。
Selector 是实现并发型非阻塞I/O 的核心.
2)




