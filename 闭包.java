闭包一直都是Java社区中争论不断的话题,很多语言例如JavaScript,Ruby,Python等都支持闭包这个语言特性,闭包功能强大且灵活,Java并没有显式地支持它,但其实Java中也存在着所谓的”闭包”.
  
这个闭包将自由变量y与内部函数绑定在了一起,也就是说,当Add(y)函数执行完毕后,它不会随着函数调用结束后被回收(不能在栈上分配空间).
  
闭包能够将一个方法作为一个变量去存储，这个方法有能力去访问所在类的自由变量。

特别注意：闭包会导致资源不被回收

同样在一个代码块中，如果某个变量在这个代码块中没被定义过，那么这个变量就可以被认为是一个自由变量。
