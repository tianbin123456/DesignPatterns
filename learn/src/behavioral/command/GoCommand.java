package behavioral.command;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class GoCommand extends Command {
    public GoCommand(
            YellowLight yellowLight, RedLight redLight, GreenLight greenLight) {
        super(yellowLight, redLight, greenLight);
    }

    @Override
    public void execute() {
        greenLight.turnOn();
        redLight.turnOff();
        yellowLight.turnOff();
    }
}
