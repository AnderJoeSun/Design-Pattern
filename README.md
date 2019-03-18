## 简介
设计模式描述了软件开发过程中若干重复出现的问题的解决方案。

这是一个设计模式的Java版本demo。

## 分类

### :star:创建型

[普通工厂](src/simplefactory)

:thinking:**严格来说，普通工并厂不是属于设计模式，因为它不符合开闭原则(在拓展Product时必须修改Factory中的方法)，但是工厂方法是对普通工厂的改进，可以放在一起对比，体会设计模式的开闭原则。**

![simplefactory](/img/simplefactory.png)

[工厂方法](src/factorymethod)

工厂方法模式为每个Product子类创建一个Factory类，这样在拓展Product的时候，只需要再拓展相应的Factory即可，不用对原有代码进行修改。

缺点:容易产生过多的平行的Product和Factory。

![factorymethod](/img/factorymethod.png)

[抽象工厂](src/abstractfactory)

工厂模式只考虑了子类水平方向上的拓展，当父类也在水平方向上扩展时，就需要使用抽象工厂模式了。

缺点:父类无法拓展。

![abstractfactory](/img/abstractfactory.png)

[生成器](src/builder)

生成器模式负责将对象的创建过程和装配过程分离，传统的创建对象方式是创建对象，同时也需要为其配置属性，一旦对象的属性发生改变时，就需要修改创建对象部分的代码。生成器模式就可以实现对修改的关闭。

缺点:当生成对象的属性数量发生变化时不再适用。

![builder](/img/builder.png)

原型

相当于复制粘贴，快速创建对象。	

缺点:需要考虑深浅拷贝的问题。

:thinking:**原型只要实现Java中的拷贝即可，深浅拷贝试情况而定，就不给出demo了**

[单例](src/singleton)

类的实例对象有且只有一个，可以避免大型对象的重复创建，节省系统资源。

![singleton](/img/singleton.png)

### :star:结构型

[适配器](/src/adapter)

适配器适用于不同接口之间的协作。

:thinking:类适配模式，适用于多继承，或者在Java中一个接口一个类。

![adapter_class](/img/adapter_class.png)

:thinking:对象适配模式，Java没有多继承，所以需要可以使用组合来实现适配。

![adapter_object](/img/adapter_object.png)

[代理](/src/proxy)

代理模式使用代理对象来完成透明间接的访问。

缺点:代理对象的接口要和目标对象接口一致。

代理模式和适配器模式的不同之处在于，适配对象和目标对象的接口不一样，适配器的目的是协调不同接口之间的协作，而代理模式代理对象和被代理对象实现了相同的接口，目的是通过代理对象来间接访问目标对象。

![proxy](/img/proxy.png)

[桥接](/src/bridge)

桥接模式将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。

![bridge](/img/bridge.png)

[享元](/src/flyweight)

享元模式运用共享技术来有効地支持大量细粒度对象的复用。

![flyweight](/img/flyweight.png)

[组成](/src/composite)

![composite](/img/composite.png)

[装饰](/src/decorator)

:thinking:装饰模式和组成模式很相似

![decorator](/img/decorator.png)

##  :star:  行为型