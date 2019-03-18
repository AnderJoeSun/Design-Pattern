## 简介
设计模式描述了软件开发过程中若干重复出现的问题的解决方案。
这是一个Java版本的设计模式demo库。

## 分类

### :star:创建型

[普通工厂](src/simplefactory)

![simplefactory](/img/simplefactory.png)

**严格来说，普通工厂不是设计模式，因为它不符合开闭原则，但是工厂方法是对普通工厂的改进，可以放在一起对比，体会设计模式的开闭原则。**

[工厂方法](src/factorymethod)

![factorymethod](/img/factorymethod.png)

[抽象工厂](src/abstractfactory)

![abstractfactory](/img/abstractfactory.png)

[生成器](src/builder)

![builder](/img/builder.png)

原型	

**原型只要实现Java中的拷贝即可，深浅拷贝试情况而定，就不给出demo了**

[单例](src/singleton)

### :star:结构型

[适配器](/src/adapter)

[组成](/src/composite)

[装饰](/src/decorator)

[桥接](/src/bridge)

[享元](/src/flyweight)

[代理](/src/proxy)

:star:行为型