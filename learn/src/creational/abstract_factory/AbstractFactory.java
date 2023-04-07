package creational.abstract_factory;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public abstract class AbstractFactory {
    abstract Vehicle getVehicle(String vehicleType);
}
