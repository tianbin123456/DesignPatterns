package behavioral.command;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class ReadyToGoCommand extends Command {
    public ReadyToGoCommand(
            YellowLight yellowLight, RedLight redLight, GreenLight greenLight) {
        super(yellowLight, redLight, greenLight);
    }

    @Override
    public void execute() {
        yellowLight.turnOn();
        redLight.turnOn();
        greenLight.turnOff();
    }
}
