package creational.singleton;

/**
 * @author tianbin
 * @date 2023/3/31
 * @Description
 * @since v1.0.0
 */
public class ByEnum {
    /**
     * 私有化构造器
     */
    private ByEnum() {

    }

    /**
     * 使用枚举
     */
    public static enum SingletonEnum {
        SINGLETON_ENUM;
        private ByEnum byEnum = null;

        SingletonEnum() {
            byEnum = new ByEnum();
        }

        public ByEnum getInstance() {
            return byEnum;
        }
    }
}
