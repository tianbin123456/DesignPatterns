package behavioral.command;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class ReadyToStopCommand extends Command{
    public ReadyToStopCommand(
            YellowLight yellowLight,RedLight redLight,GreenLight greenLight) {
        super(yellowLight ,redLight,greenLight);
    }
    @Override
    public void execute() {
        yellowLight.turnOn();
        redLight.turnOff();
        greenLight.turnOff();
    }
}
