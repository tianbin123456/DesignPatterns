package creational.abstract_factory;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractFactory light = factoryProvider.getFactory("light");
        Vehicle car = light.getVehicle("car");
        car.make();
    }
}
