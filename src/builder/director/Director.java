package builder.director;

import builder.builder.Builder;
import builder.product.Product;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getResult();
    }

}
