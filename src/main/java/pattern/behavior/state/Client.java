package pattern.behavior.state;

/**
 * 状态模式:当一个对象的内在状态改变时允许改变其行为,这个对象看起来像是改变了其类;
 * 主要用于:当控制 对象状态转换的条件表达式过于复杂时得情况.
 * 把状态的判断逻辑转移到表示不同状态的一系列类当中,可以把复杂的判断逻辑简化;
 *
 */
public class Client {
    public static void main(String[] args) {
        Context c = new Context(new ConcrereStateA());
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
