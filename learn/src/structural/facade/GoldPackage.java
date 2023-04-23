package structural.facade;

/**
 * @author tianbin
 * @date 2023/4/23
 * @Description
 * @since v1.0.0
 */
public class GoldPackage implements TrevelPackage {
    @Override
    public TrevelPackage getTrevelPackage() {
        System.out.println(" Gold Trevel Package");
        return this;
    }
}
