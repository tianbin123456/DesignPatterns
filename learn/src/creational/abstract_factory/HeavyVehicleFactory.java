package creational.abstract_factory;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class HeavyVehicleFactory extends AbstractFactory {
    @Override
    Vehicle getVehicle(String vehicleType) {
        if ("lorry".equals(vehicleType)) {
            return new Lorry();
        }
        if ("bus".equals(vehicleType)) {
            return new Bus();
        }
        return null;
    }
}
