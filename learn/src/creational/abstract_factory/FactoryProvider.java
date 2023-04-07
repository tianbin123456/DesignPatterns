package creational.abstract_factory;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class FactoryProvider {
    AbstractFactory getFactory(String type) {
        if ("heavy".equals(type)) {
            return new HeavyVehicleFactory();
        }
        if ("light".equals(type)) {
            return new LightVehicleFactory();
        }
        return null;
    }

    ;
}
