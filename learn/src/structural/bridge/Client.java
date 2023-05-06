package structural.bridge;

/**
 * @author tianbin
 * @date 2023/5/6
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Weapon weapon = new Sword(new FlyingEnchantment());
        weapon.wield();
        weapon.swing();
        weapon.unwield();
    }

}
