package pattern.struct.proxy.bytecodemodify;

import pattern.struct.proxy.Request;
import pattern.struct.proxy.staticproxy.ConcreteRequest;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibProxy {
    public static void main(String[] args) {
        Request request = new ConcreteRequest();
        Enhancer en = new Enhancer();
        en.setSuperclass(request.getClass());
        en.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("调用前");
                method.invoke(request, args);
                System.out.println("调用后");
                return null;
            }
        });
        Request requestProxy = (Request) en.create();
        requestProxy.requset();
        System.out.println(requestProxy.getClass());
    }
}
