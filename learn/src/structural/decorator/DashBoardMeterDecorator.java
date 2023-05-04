package structural.decorator;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public class DashBoardMeterDecorator extends CarDecorator {

    public DashBoardMeterDecorator(Car car) {
        super(car);
    }

    @Override
    public void manufacture() {
        car.manufacture();
        addDashBoardMeter(car);
    }

    public void addDashBoardMeter(Car car) {
        System.out.print("Adding Extra DashBoard Meters to car ");
    }
}
