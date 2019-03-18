package proxy;

public class Proxy implements Subject {
    private Subject subject = new RealSubject();

    @Override
    public void request() {
        subject.request();
    }
}
