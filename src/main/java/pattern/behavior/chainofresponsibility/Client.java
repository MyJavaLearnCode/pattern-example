package pattern.behavior.chainofresponsibility;

/**
 * 职责链模式:使多个对象都有机会处理请求,从而避免请求的发送者和接受者之间的耦合;
 * 将这个对象连成一条链,并沿着这条链传递该请求,知道有一个对象处理他为止;
 * apache的责任链模式实现:http://commons.apache.org/proper/commons-chain/
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        h2.setSuccessor(h1);

        int[] reqs = {0,1,5,10,20,30};

        for (int req : reqs) {
            h2.handlerRequset(req);
        }
    }

}
