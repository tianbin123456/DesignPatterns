package creational.factory;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class CarFactory {
    public Car getCar(String type) {
        if ("honda".equals(type)) {
            return new HondaCar();
        }
        if ("bmw".equals(type)) {
            return new BMWCar();
        }
        return null;
    }
}
