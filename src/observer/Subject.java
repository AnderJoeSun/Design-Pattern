package observer;

public abstract class Subject {
    public abstract void addObserver(Observer o);

    public abstract void delObserver(Observer o);

    public void update() {

    }
}
