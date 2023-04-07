package creational.singleton;

/**
 * @author tianbin
 * @date 2023/3/31
 * @Description 饿汉模式
 * @since v1.0.0
 */
public class Early {
    /**
     * 提前实例化对象
     */
    private static final Early early = new Early();

    public static Early getInstance() {
        return early;
    }

    /**
     * 私有化构造器
     */
    private Early() {
    }
}
