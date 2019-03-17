package factorymethod.factory;

import factorymethod.product.AbstractProduct;

public interface AbstractFactory {
    AbstractProduct createProduct();
}
