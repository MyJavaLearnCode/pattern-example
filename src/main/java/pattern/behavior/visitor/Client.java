package pattern.behavior.visitor;

/**
 * 访问者模式:表示一个作用于某对象结构中的各元素的操作;
 * 它使你可以不改变各元素的类前提下定义作用于这些元素的新操作;
 * 把数据的处理与数据结构分离开,适用于数据结构相对问题的系统;
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());
        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
        o.accept(visitor1);
        o.accept(visitor2);
    }
}
