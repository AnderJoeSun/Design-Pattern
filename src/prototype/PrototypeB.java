package prototype;

public class PrototypeB implements Prototype {
    @Override
    public Prototype clone() {
        return new PrototypeCache().getPrototype(this.getClass());
    }
}
