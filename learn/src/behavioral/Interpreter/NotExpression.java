package behavioral.Interpreter;

/**
 * @author tianbin
 * @date 2023/7/17
 * @Description
 * @since v1.0.0
 */
public class NotExpression implements IExpression {
    IExpression iExpression;

    public NotExpression(IExpression iExpression) {
        this.iExpression = iExpression;
    }

    @Override
    public int interpret() {
        if (iExpression.interpret() == 1) {
            return 0;
        } else {
            return 1;
        }
    }
}
