# Spring框架IOC功能的实现

使用**容器管理对象**

我们<b><span style="color: red">将被管理的对象统称为Bean对象</span></b>



为了实现这个容器，要解决以下几个主要问题

![image-20211205145405110](https://gitee.com/mrth4869/pic/raw/master/20211205145405.png)



据此，将通过版本迭代来逐步实现和完善容器



## 0.2ver

改动0.1ver，添加实现以下内容：

1.**将对象的创建交给容器（实例化）**

2.**以单例模式从缓存中获取对象**

3.**更好的扩展性**


#### 设计思路

**容器创建对象（实例化）可以通过反射来实现**：

1. 将获取到的Class对象，封装成类信息BeanDefinition，注册（存放）到一个注册表BeanDefinitionRegistry中
2. 从注册表中获取类信息，通过反射创建对象

**单例模式与缓存的实现：**

使用HashMap作为缓存（单例注册表）SingletonBeanRegistry，存放实例化的对象；

实例化对象前先去检查缓存，缓存有，则取缓存；反之则实例化新对象；

**更好的扩展性：**

![image-20211205174359137](https://gitee.com/mrth4869/pic/raw/master/20211205174359.png)

<center>接口只定义核心的功能，由抽象类实现并规范附加功能，直到某个实现类完善所有未实现的功能</center>



例如对于BeanFactory，其核心方法为`getBean`，那么不妨将其制成接口，将此方法交由抽象类AbstractBeanFactory实现，而AbstractBeanFactory本身又规范了附加功能；

又例如对于BeanDefiinitionRegistry类信息注册表而言，其核心是提供`registerBeanDefinition`方法，故可以制成接口

又例如对于SingletonBeanRegistry单例注册表（单例缓存）而言，其核心是提供`getSingleton`方法，故也可以制成接口；

![image-20211205175044261](https://gitee.com/mrth4869/pic/raw/master/20211205175044.png)
