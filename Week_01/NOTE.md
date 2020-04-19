# 学习笔记
## 准备工作
工欲善其事必先利其器  
+ 准备好的工具 IDEA、GIT、iTerm2、Sublime Text  
+ 养成好的习惯  
    - 编码习惯
    - 快捷键
    - 学习方式 五毒神掌

时间空间复杂度  
![](https://images0.cnblogs.com/i/608996/201408/141025088894028.png)
## 存储结构
### 数组 array  
+ 有限个相同类型的变量所组成的有序集合，在内存中是顺序存储结构
+ 随机读取O(1)
+ 插入/删除 O(n)
### 链表 linked list  
+ 在内存中随机存储结构
+ 读取O(n)
+ 插入/删除 O(1)
### 单链表
![](https://www.javazhiyin.com/wp-content/uploads/2019/08/java9-1566526073.png)
链表的每一个节点通过“指针”链接起来，每一个节点有2部分组成，一部分是数据，另一部分是后继指针（用来存储后一个节点的地址），在这条链中，最开始的节点称为Head，最末尾节点的指针指向NULL。
### 双向链表
![](https://www.javazhiyin.com/wp-content/uploads/2019/08/java0-1566526073.png)
双向链表与单向链表的区别是前者是2个方向都有指针，后者只有1个方向的指针。双向链表的每一个节点都有2个指针，一个指向前节点，一个指向后节点。双向链表在操作的时候比单向链表的效率要高很多，但是由于多一个指针空间，所以占用内存也会多一点。
### 循环链表
![](https://www.javazhiyin.com/wp-content/uploads/2019/08/java6-1566526073.png)
循环链表就是一种特殊的单向链表，只不过在单向链表的基础上，将尾节点的指针指向了Head节点，使之首尾相连。
### 跳表 skip list  
+ 一个随机化的数据结构，实质就是一种可以进行二分查找的有序链表。
+ 在原有的有序链表上面增加了多级索引，通过索引来实现快速查找。
+ 不仅能提高搜索性能，同时也可以提高插入和删除操作的性能。
![](https://raw.githubusercontent.com/wangzhenyu/algorithm008-class01/master/Week_01/skiplist3.png)
跳表查询、插入、删除的时间复杂度为O(log n)，与平衡二叉树接近；
redis用的眺表
## 逻辑结构 - 线性结构s
### 栈 stack  
+ FILO(First In Last Out)   
+ 限定仅在表尾进行插入和删除操作的线性表
+ 允许插入和删除的一端称为栈顶 (top) ，另一端称为栈底 (bottom)
### 队列 queue
FIFO(First In First Out) 
### 优先队列 PriorityQueue
#### JAVA 
+ PriorityQueue 是基于优先堆的一个无界队列，这个优先队列中的元素可以默认自然排序或者通过提供的Comparator 在队列实例化的时排序。
+ PriorityQueue 不允许空值，而且不支持 non-comparable（不可比较）的对象，比如用户自定义的类。优先队列要求使用 Java Comparable 和 Comparator 接口给对象排序，并且在排序时会按照优先级处理其中的元素。
+ PriorityQueue 的大小是不受限制的，但在创建时可以指定初始大小。当我们向优先队列增加元素的时候，队列大小会自动增加。
+ PriorityQueue 是非线程安全的，所以 Java 提供了 PriorityBlockingQueue（实现 BlockingQueue接口）用于Java 多线程环境。
#### 实现原理
通过堆实现，具体说是通过完全二叉树（complete binary tree）实现的小顶堆（任意一个非叶子节点的权值，都不大于其左右子节点的权值），也就意味着可以通过数组来作为 PriorityQueue 的底层实现。
#### 使用场景
+ 求 Top K 大的元素
+ 维护数据流中的中位数
### 双端队列 deque
+ 将元素添加到队尾或队首：addLast()/offerLast()/addFirst()/offerFirst()；
+ 从队首／队尾获取元素并删除：removeFirst()/pollFirst()/removeLast()/pollLast()；
+ 从队首／队尾获取元素但不删除：getFirst()/peekFirst()/getLast()/peekLast()；
+ 总是调用xxxFirst()/xxxLast()以便与Queue的方法区分开；
+ 避免把null添加到队列。


