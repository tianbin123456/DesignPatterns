package structural.bridge;

/**
 * @author tianbin
 * @date 2023/5/6
 * @Description
 * @since v1.0.0
 */
public interface Enchantment {
    void onActivate();
    void apply();
    void onDeactivate();
}
