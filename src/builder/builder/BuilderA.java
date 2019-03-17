package builder.builder;

public class BuilderA extends Builder {
    @Override
    public void buildA() {
        product.setPartA("BuilderA");
    }

    @Override
    public void buildB() {
        product.setPartB("BuilderA");
    }

    @Override
    public void buildC() {
        product.setPartC("BuilderA");
    }
}
