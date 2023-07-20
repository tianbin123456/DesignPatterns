package behavioral.command;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class StopCommand extends Command{
    public StopCommand(
            YellowLight yellowLight,RedLight redLight,GreenLight greenLight) {
        super(yellowLight ,redLight,greenLight);
    }
    @Override
    public void execute() {
        redLight.turnOn();
        yellowLight.turnOff();
        greenLight.turnOff();
    }
}
