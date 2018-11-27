package pattern.struct.decorate;

/**
 * 装饰器模式:动态的给一个对象添加一些额外的职责;
 * 就增加功能来说,装饰器模式比生成子类更为灵活;
 *
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();
        b.setComponent(a);
        a.setComponent(c);
        b.operation();
    }
}
