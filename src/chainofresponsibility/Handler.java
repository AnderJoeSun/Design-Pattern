package chainofresponsibility;

public abstract class Handler {
    private Handler next;

    public abstract void handlerRequest();
}
