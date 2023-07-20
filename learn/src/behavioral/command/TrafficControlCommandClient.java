package behavioral.command;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class TrafficControlCommandClient {
    public static void main(String[] args) {
        GreenLight greenLight = new GreenLight();    //receiver 1 Green Light
        RedLight redLight = new RedLight();  //receiver 2 Red Light
        YellowLight yellowLight = new YellowLight();   //receiver 3 Yellow Light
        TrafficControlCenter controlCenter = new TrafficControlCenter(); //Invoker
        System.out.println("Stop Command");
        controlCenter.setCommand(
                new StopCommand(yellowLight, redLight, greenLight));
        controlCenter.executeCommand();
        System.out.println("");
        System.out.println("Ready To Go Command ");
        controlCenter.setCommand(
                new ReadyToGoCommand(yellowLight, redLight, greenLight));
        controlCenter.executeCommand();
        System.out.println("");
        System.out.println("Go Command");
        controlCenter.setCommand(
                new GoCommand(yellowLight, redLight, greenLight));
        controlCenter.executeCommand();
        System.out.println("");
        System.out.println("Ready To Stop Command");
        controlCenter.setCommand(
                new ReadyToStopCommand(yellowLight, redLight, greenLight));
        controlCenter.executeCommand();

    }
}
