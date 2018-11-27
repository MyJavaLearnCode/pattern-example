package pattern.creat.factorymethod;

/**
 * 定义一个用于创建对象的接口,让子类决定去实例化哪一个类;
 * 简单工厂则是由一个工厂生产所有的产品;
 * 简单说:每个工厂生产固定的产品;
 */
public class Client {
    public static void main(String[] args) {
        IFactory factoryA = new FactoryA();
        IProduct productA = factoryA.creat();
        productA.doSomething();

        IFactory factoryB = new FactoryB();
        IProduct productB = factoryB.creat();
        productB.doSomething();
    }
}
