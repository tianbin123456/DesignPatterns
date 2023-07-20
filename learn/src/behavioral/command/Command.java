package behavioral.command;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public abstract class Command {
    GreenLight greenLight;
    YellowLight yellowLight;
    RedLight redLight;

    public Command(YellowLight yellowLight, RedLight redLight, GreenLight greenLight) {
        this.yellowLight = yellowLight;
        this.redLight = redLight;
        this.greenLight = greenLight;
    }

    abstract void execute();

}
