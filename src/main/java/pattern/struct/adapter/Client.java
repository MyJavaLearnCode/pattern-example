package pattern.struct.adapter;

/**
 * 用于处理两个接口之间的转换问题;
 * 另一种写法,适配器直接实现两个接口,叫two-way adapter
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.request();
    }
}
