package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tianbin
 * @date 2023/3/31
 * @Description
 * @since v1.0.0
 */
public class CarCacheStore {
    private static Map<String, Car> carMap = new HashMap<>();

    static {
        Car bmwCar = new BmwCar();
        bmwCar.setColor("Red");
        bmwCar.setType("Auto");
        bmwCar.setModel("BMW");
        carMap.put("BMW", bmwCar);

        Car hondaCar = new HondaCar();
        hondaCar.setColor("White");
        hondaCar.setType("Auto");
        hondaCar.setModel("HONDA");
        carMap.put("HONDA", hondaCar);

        Car volvoCar = new VolvoCar();
        volvoCar.setColor("Blue");
        volvoCar.setType("Auto");
        volvoCar.setModel("VOLVO");
        carMap.put("VOLVO", volvoCar);
    }

    public static Car getInstance(String name) {
        //clone
        return (Car) carMap.get(name).clone();
    }
}
