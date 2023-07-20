package behavioral.Interpreter;

/**
 * @author tianbin
 * @date 2023/7/17
 * @Description
 * @since v1.0.0
 */
public class TerminalExpression implements IExpression {
    int data;

    public TerminalExpression(String data) {
        this.data = Integer.parseInt(data);
    }

    public TerminalExpression(int data) {
        this.data = data;
    }

    @Override
    public int interpret() {
        if (data == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
