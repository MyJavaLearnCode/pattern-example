package pattern.struct.bridge;

/**
 * 合成聚合原则:尽量使用合成/聚合,不要使用类继承;
 *
 * 桥接模式:将抽象部分与它的实现分离,使他们都可以独立的变化;
 * 不同于代理模式,代理模式要求具有相同的行为,实现相同的接口;
 */
public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstration();
        ab.setImplementor(new ImplementA());
        ab.operation();

    }
}
