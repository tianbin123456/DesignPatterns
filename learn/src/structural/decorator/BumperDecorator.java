package structural.decorator;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public class BumperDecorator extends CarDecorator {
    public BumperDecorator(Car car) {
        super(car);
    }

    @Override
    public void manufacture() {
        car.manufacture();
        addBumper(car);
    }

    public void addBumper(Car car) {
        System.out.print("Adding Bumper to car ");
    }
}
