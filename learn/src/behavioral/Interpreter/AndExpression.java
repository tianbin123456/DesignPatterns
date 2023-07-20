package behavioral.Interpreter;

/**
 * @author tianbin
 * @date 2023/7/17
 * @Description
 * @since v1.0.0
 */
public class AndExpression implements IExpression {
    IExpression leftExpression;
    IExpression rightExpresion;
    public AndExpression(IExpression leftExpression,
                         IExpression rightExpresion) {
        this.leftExpression = leftExpression;
        this.rightExpresion = rightExpresion;
    }
    @Override
    public int interpret() {
        return leftExpression.interpret() * rightExpresion.interpret();
    }
}
