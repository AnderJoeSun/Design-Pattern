package factorymethod.factory;

import factorymethod.product.AbstractProduct;
import factorymethod.product.ProductB;

public class FactoryB implements AbstractFactory{
    @Override
    public AbstractProduct createProduct() {
        return new ProductB();
    }
}
