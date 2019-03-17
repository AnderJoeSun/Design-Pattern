package prototype;

public class PrototypeA implements Prototype {
    public Prototype clone() {
        return new PrototypeCache().getPrototype(this.getClass()) ;
    }
}
