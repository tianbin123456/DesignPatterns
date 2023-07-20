package behavioral.command;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class GreenLight {

    public  void turnOn() {
        System.out.println("Showing Green Light");
    }
    public void turnOff() {
        System.out.println("Hiding Green Light");
    }
}
