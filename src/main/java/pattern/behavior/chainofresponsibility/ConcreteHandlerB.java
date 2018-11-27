package pattern.behavior.chainofresponsibility;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handlerRequset(int req) {
        if (req >= 0 && req < 10) {
            System.out.println("B deal " + req);
        } else {
            successor.handlerRequset(req);
        }
    }
}
