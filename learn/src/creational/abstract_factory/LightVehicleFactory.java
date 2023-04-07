package creational.abstract_factory;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class LightVehicleFactory extends AbstractFactory {
    @Override
    Vehicle getVehicle(String vehicleType) {
        if ("car".equals(vehicleType)) {
            return new Car();
        }
        return null;
    }
}
