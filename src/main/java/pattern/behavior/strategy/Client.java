package pattern.behavior.strategy;

/**
 * 策略模式:定义了算法家族,分别封装起来.让他们之间可以相互替换;
 * 让算法的的变化不会影响使用算法的客户;
 * 其实算是最进本的接口使用方式
 * todo:开源类库中的使用
 */
public class Client {
    public static void main(String[] args) {
        Context context = null;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();

    }
}
