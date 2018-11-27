package pattern.struct.decorate;

public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "new state";
        System.out.println("具体装饰对象A的附加操作");
    }
}
