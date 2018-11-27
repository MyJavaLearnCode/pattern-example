package pattern.behavior.observer;

public class ConcreteObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("B");
    }
}
