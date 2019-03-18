package flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;

public class FlyweightFactory {
    private static HashMap<Class, Flyweight> flyweights = new HashMap<>();
    private static FlyweightA flyweightA = new FlyweightA();
    private static FlyweightB flyweightB = new FlyweightB();

    public FlyweightFactory() {
        flyweights.put(FlyweightA.class, new FlyweightA());
        flyweights.put(FlyweightB.class, new FlyweightB());
    }
}
