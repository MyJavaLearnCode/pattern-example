package pattern.creat.singleton;

/**
 *
 * 最简单的单例模式写法(饿汉式)
 * 由java虚拟机保证单例的唯一性
 * 由于类初始化的时候直接生成对象,导致类加载比较慢,实际初始化后并不一定马上用到;
 * 如果单例对象比较庞大,会提前占用内存
 *
 * 反序列化情况下的单例
 */
public class BasicSingleton {
    private static BasicSingleton ourInstance = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return ourInstance;
    }

    private BasicSingleton() {
    }
}
