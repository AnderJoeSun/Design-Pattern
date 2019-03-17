package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.procuct.AbstractProductA;
import abstractfactory.procuct.AbstractProductB;

public class Client {
    private AbstractProductA a;
    private AbstractProductB b;

    public void create(AbstractFactory af) {
        a = af.createProductA();
        b = af.createProductB();
    }
}
