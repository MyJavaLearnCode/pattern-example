package pattern.struct.proxy.dynamicproxy;

import pattern.struct.proxy.Request;
import pattern.struct.proxy.staticproxy.ConcreteRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        /*
        * 生成中间过程class文件
        * */
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", true);

        Request request = new ConcreteRequest();
        Request requestProxy = (Request) Proxy.newProxyInstance(request.getClass().getClassLoader(), request.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始调用");
                method.invoke(request, args);
                System.out.println("结束调用");
                return null;
            }
        });
        requestProxy.requset();
        System.out.println(requestProxy.getClass());
    }
}
