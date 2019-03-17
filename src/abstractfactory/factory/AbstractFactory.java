package abstractfactory.factory;
/**
 *
 **/


import abstractfactory.procuct.AbstractProductA;
import abstractfactory.procuct.AbstractProductB;

public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
