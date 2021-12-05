# Spring框架IOC功能的实现

使用**容器管理对象**

我们<b><span style="color: red">将被管理的对象统称为Bean对象</span></b>



为了实现这个容器，要解决以下几个主要问题

![image-20211205145405110](https://gitee.com/mrth4869/pic/raw/master/20211205145405.png)



据此，将通过版本迭代来逐步实现和完善容器



## 0.1ver

最简单的实现，只包含一个容器

![image-20211205152755313](https://gitee.com/mrth4869/pic/raw/master/20211205152755.png)

先不考虑bean定义信息的获取、信息存放、实例化问题以及bean的存放等问题

只考虑：

1.**托管对象**（托管指对象已经存在）

2.**获取对象**


#### 设计思路

主要考虑托管的实现，即存在多个对象的时候必须有某种数据结构来存放；

我们希望通过名字就可以进行管理，那么<K，V>键值对就是个很好的选择，即存放到map中；

我们希望其拥有较好的获取/查找的效率，那么可以选择用HashMap用于存放对象

