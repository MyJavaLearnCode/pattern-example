package pattern.struct.proxy.staticproxy;

import pattern.struct.proxy.Request;

public class ConcreteRequest implements Request {
    @Override
    public void requset() {
        System.out.println("执行请求");
    }
}
