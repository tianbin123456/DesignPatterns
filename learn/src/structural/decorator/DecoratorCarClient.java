package structural.decorator;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public class DecoratorCarClient {
    public static void main(String[] args) {
        Car suvCar = new SuvCar();
        suvCar.manufacture();
        System.out.println();
        System.out.println("---------------------------------------------");
        BumperDecorator bumperDecorator = new BumperDecorator(suvCar);
        bumperDecorator.manufacture();
        System.out.println();
        System.out.println("---------------------------------------------");
        Car tailLightDecorator = new TailLightDecorator(new DashBoardMeterDecorator(new BumperDecorator(new HatchBackCar())));
        tailLightDecorator.manufacture();
        System.out.println();
        System.out.println("---------------------------------------------");
    }
}
