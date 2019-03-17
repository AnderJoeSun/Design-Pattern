package prototype;

import java.util.HashMap;

public class PrototypeCache {
    private HashMap<Class, Prototype> prototypeCache = new HashMap();
    private PrototypeA prototypeA = new PrototypeA();
    private PrototypeB prototypeB = new PrototypeB();

    public PrototypeCache() {
        prototypeCache.put(prototypeA.getClass(), prototypeA);
        prototypeCache.put(prototypeB.getClass(), prototypeB);
    }

    public Prototype getPrototype(Class c) {
        return prototypeCache.get(c);
    }
}
