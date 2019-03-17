package abstractfactory.factory;

import abstractfactory.procuct.AbstractProductA;
import abstractfactory.procuct.AbstractProductB;
import abstractfactory.procuct.ProductA2;
import abstractfactory.procuct.ProductB2;

public class FactoryB implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
