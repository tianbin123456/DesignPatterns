package structural.bridge;

/**
 * @author tianbin
 * @date 2023/5/6
 * @Description
 * @since v1.0.0
 */
public class SoulEatingEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        System.out.println("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        System.out.println("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Bloodlust slowly disappears.");
    }
}
