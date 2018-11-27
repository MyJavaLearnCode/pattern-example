package pattern.creat.singleton;

/**
 * 内部类实现方式,还可以用枚举实现单例
 */
public class InnerClassSingleton {
    private static class SingletonHandler {
        private static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }
    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        return SingletonHandler.innerClassSingleton;
    }
}
