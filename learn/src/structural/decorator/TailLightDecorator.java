package structural.decorator;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public class TailLightDecorator extends CarDecorator {
    public TailLightDecorator(Car car) {
        super(car);
    }

    @Override
    public void manufacture() {
        car.manufacture();
        addTailLight(car);
    }

    public void addTailLight(Car car) {
        System.out.print("Adding Extra Tail Lights to car ");
    }
}
