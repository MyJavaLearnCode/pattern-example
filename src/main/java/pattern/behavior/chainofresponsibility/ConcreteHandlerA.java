package pattern.behavior.chainofresponsibility;

public class ConcreteHandlerA extends Handler {
    @Override
    public void handlerRequset(int req) {
        if (req >= 10 && req <= 20) {
            System.out.println("B deal " + req);
        } else if (successor != null) {
            successor.handlerRequset(req);
        } else {
            System.out.println("can't deal this req " + req);
        }
    }
}
