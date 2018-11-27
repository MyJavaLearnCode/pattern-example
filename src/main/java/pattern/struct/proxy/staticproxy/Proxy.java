package pattern.struct.proxy.staticproxy;

import pattern.struct.proxy.Request;

public class Proxy implements Request {
    private Request requset;

    @Override
    public void requset() {
        if (requset == null) {
            requset = new ConcreteRequest();
        }
        requset.requset();
    }
}
