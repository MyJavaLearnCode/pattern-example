package pattern.creat.singleton;

/**
 * 懒加载(懒汉式)单例写法
 * 进一步减少了同步的开销
 * 代码复杂度也相应的提升,要求编写者对多线程比较了解;
 * 适用于资源非常敏感的场景;
 */
public class LazyLoadSingleton {
    /**
     * 注意volatile关键字,保证对象构建完成后才会被看到;
     */
    private static volatile LazyLoadSingleton lazyLoadSingleton = null;
    private static final Object lock = new Object();

    private LazyLoadSingleton() {
    }

    public LazyLoadSingleton getInstance() {
        if (lazyLoadSingleton != null) {
            synchronized (lock) {
            /*
            或者删除lock锁字段,直接说class对象
            synchronized (LazyLoadSingleton.class)
            */
                if (lazyLoadSingleton != null) {
                    lazyLoadSingleton = new LazyLoadSingleton();
                }
            }
        }
        return lazyLoadSingleton;
    }
}
