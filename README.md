## 简介
设计模式描述了软件开发过程中若干重复出现的问题的解决方案。
这是一个Java版本的设计模式demo库。

## 分类

### :star:创建型

[普通工厂](src/simplefactory)

:thinking:**严格来说，普通工厂不是设计模式，因为它不符合开闭原则，但是工厂方法是对普通工厂的改进，可以放在一起对比，体会设计模式的开闭原则。**

![simplefactory](/img/simplefactory.png)

[工厂方法](src/factorymethod)

![factorymethod](/img/factorymethod.png)

[抽象工厂](src/abstractfactory)

![abstractfactory](/img/abstractfactory.png)

[生成器](src/builder)

![builder](/img/builder.png)

原型	

:thinking:**原型只要实现Java中的拷贝即可，深浅拷贝试情况而定，就不给出demo了**

[单例](src/singleton)

![singleton](/img/singleton.png)

### :star:结构型

[适配器](/src/adapter)

:thinking:类适配模式，适用于多继承，或者在Java中一个接口一个类。

![adapter_class](/img/adapter_class.png)

:thinking:对象适配模式，Java没有多继承，所以需要可以使用组合来实现适配。

![adapter_object](/img/adapter_object.png)

[代理](/src/proxy)

![proxy](/img/proxy.png)

[桥接](/src/bridge)

![bridge](/img/bridge.png)

[享元](/src/flyweight)

![flyweight](/img/flyweight.png)

[组成](/src/composite)

![composite](/img/composite.png)

[装饰](/src/decorator)

:thinking:装饰模式和组成模式很相似

![decorator](/img/decorator.png)

:star:行为型

