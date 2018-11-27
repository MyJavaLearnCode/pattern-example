package pattern.struct.proxy.staticproxy;

import pattern.struct.proxy.Request;

/**
 * 为其他的对象提供一种代理以控制这个对象的访问
 * 关键点:代理和被代理角色具有相同的行为能力
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Proxy();
        request.requset();
    }
}
