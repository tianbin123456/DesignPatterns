package structural.decorator;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void manufacture() {
        car.manufacture();
    }
}
