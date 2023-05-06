package structural.bridge;

/**
 * @author tianbin
 * @date 2023/5/6
 * @Description
 * @since v1.0.0
 */
public interface Weapon {
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();
}
