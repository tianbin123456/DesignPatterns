package creational.singleton;

/**
 * @author tianbin
 * @date 2023/3/31
 * @Description 懒汉模式
 * @since v1.0.0
 */
public class Lazy {
    /**
     * 设置内存可见 禁止指令重排
     */
    private volatile static Lazy lazy;

    /**
     * 双检查机制 加锁
     *
     * @return Lazy
     */
    public static Lazy getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                //再次校验 防止多个线程进入加锁队列是，切换cpu时间片时，重新创建对象
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }

    private Lazy() {
    }

}
