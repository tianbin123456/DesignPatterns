package structural.decorator;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public class SuvCar implements Car{
    @Override
    public void manufacture() {
        System.out.print("Manufacturing defalt SUV car ");
    }
}
