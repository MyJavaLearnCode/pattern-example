package pattern.creat.singleton;

/**
 * 同步静态方法达到单例,由于采用同步了整个静态方法,同步开销相对比较大;
 * 最推荐的写法
 */
public class SyncStaticMethodSingleton {
    private static SyncStaticMethodSingleton syncStaticMethodSingleton = null;

    private SyncStaticMethodSingleton() {
    }

    public synchronized SyncStaticMethodSingleton getInstance() {
        if (syncStaticMethodSingleton == null) {
            syncStaticMethodSingleton = new SyncStaticMethodSingleton();
        }
        return syncStaticMethodSingleton;
    }
}
