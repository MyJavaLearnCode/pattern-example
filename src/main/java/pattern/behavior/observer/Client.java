package pattern.behavior.observer;

/**
 * 观察者模式(发布-订阅模式):定义了一种一对多的依赖关系,让多个观察者对象同时监听某一个主题对象;
 * 这个主题在状态发生变化的时候,会通知所有的观察者对象,是他们能够自动更新自己;
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ConcreteObserverA());
        subject.addObserver(new ConcreteObserverB());
        subject.publish();
    }

}
