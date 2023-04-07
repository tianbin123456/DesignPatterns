package creational.prototype;

/**
 * @author tianbin
 * @date 2023/3/31
 * @Description
 * @since v1.0.0
 */
public class PrototypeClient {
    public static void main(String[] args) {
        // Get BMW car copy
        Car car1  = CarCacheStore.getInstance("BMW");
        System.out.println(car1);
        // Get HONDA car copy
        Car car2  = CarCacheStore.getInstance("HONDA");
        System.out.println(car2);
        // Get VOLVO car copy
        Car car3  = CarCacheStore.getInstance("VOLVO");
        System.out.println(car3);
    }
}
