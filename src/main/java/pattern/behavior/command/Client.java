package pattern.behavior.command;

/**
 * 命令模式:将一个请求封装为一个对象,从而使你可用不同的请求对客户进行参数化;
 * 对请求排队或者记录日志,以及支持可撤销的操作;
 */
public class Client {
    public static void main(String[] args) {
        Receicer receicer = new Receicer();
        Command cmd = new ConcreteCommand(receicer);
        Invoker invoker = new Invoker();
        invoker.setCommand(cmd);
        invoker.exeCmd();
    }
}
