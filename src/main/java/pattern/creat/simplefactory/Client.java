package pattern.creat.simplefactory;

/**
 * 根据不同的输入构造相应的实例返回,封装了判断逻辑;
 * 客户端无需自己写逻辑判断;
 */
public class Client {

    public static void main(String[] args) {
        IOperation op = Factory.getOperation("");
        op.doSomething();
        IOperation opB = Factory.getOperation(null);
        opB.doSomething();
    }
}
