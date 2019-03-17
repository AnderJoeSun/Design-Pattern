package simplefactory.factory;

import simplefactory.product.AbstractProduct;
import simplefactory.product.ProductA;
import simplefactory.product.ProductC;

public class Factory {
    AbstractProduct product = null;

    public AbstractProduct getProduct(String s) {
        switch (s) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductA();
                break;
            case "C":
                product = new ProductC();
                break;
        }
        return product;
    }
}
