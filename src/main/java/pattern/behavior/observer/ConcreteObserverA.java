package pattern.behavior.observer;

public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("A");
    }
}
