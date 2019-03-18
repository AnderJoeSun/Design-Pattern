package adapter.object;

public class Adapter extends Adaptee {
    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.specificRequest();
    }
}
