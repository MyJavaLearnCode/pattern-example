package pattern.struct.flyweight;

/**
 * 享元模式:运用共享技术支持大量细粒度的重复对象;
 *
 * 值类型的包装类均使用了这一模式,java.lang.Boolean#valueOf(boolean)
 */
public class Client {
    public static void main(String[] args) {
        Flyweight f = FlyweightFactory.getFlyweight("X");
        f.op();
    }
}
