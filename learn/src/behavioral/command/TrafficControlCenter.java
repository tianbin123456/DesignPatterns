package behavioral.command;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class TrafficControlCenter {
    Command command;

    //Setting runtime command
    public void setCommand(Command command) {
        this.command = command;
    }

    //Invoke appropriate command
    public void executeCommand() {
        command.execute();
    }
}
