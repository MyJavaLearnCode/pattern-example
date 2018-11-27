package pattern.struct.decorate;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("装饰对象B的添加操作");
    }
}
