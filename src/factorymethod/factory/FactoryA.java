package factorymethod.factory;


import factorymethod.product.AbstractProduct;
import factorymethod.product.ProductA;

public class FactoryA implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ProductA();
    }
}
