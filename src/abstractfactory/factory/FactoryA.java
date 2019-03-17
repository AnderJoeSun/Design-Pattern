package abstractfactory.factory;

import abstractfactory.procuct.AbstractProductA;
import abstractfactory.procuct.AbstractProductB;
import abstractfactory.procuct.ProductA1;
import abstractfactory.procuct.ProductB1;

public class FactoryA implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
