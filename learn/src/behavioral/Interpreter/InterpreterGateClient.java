package behavioral.Interpreter;


/**
 * @author tianbin
 * @date 2023/7/17
 * @Description
 * @since v1.0.0
 */
public class InterpreterGateClient {
    //           _
    //OutPut= AB+B // Main Context to create input
    //| A | B | Out |
    //| 0 | 0 |  1  |
    //| 0 | 1 |  0  |
    //| 1 | 0 |  1  |
    //| 1 | 1 |  1  |
    public static void main(String[] args) {
        int[][] input = new Content().getInput();
        for (int A = 0; A < input.length; ++A) {
            // AND expression - AB
            IExpression andGate =
                    getAndExpression(input[A][0], input[A][1]);
            int andResult = andGate.interpret();
            //                  _
            // NOT expression - B
            IExpression notGate =
                    getNotExpression(input[A][1]);
            int notResult = notGate.interpret();//
            //                    _
            // OR expression - AB+B
            IExpression orGate =
                    getOrExpression(andResult, notResult);
            int finalResult = orGate.interpret();
            System.out.println("Final Result is " + finalResult);
        }
    }

    //Create AND exression Class
    public static IExpression getAndExpression(int left, int right) {
        IExpression leftExpression = new TerminalExpression(left);
        IExpression rightExpresion = new TerminalExpression(right);
        return new AndExpression(leftExpression, rightExpresion);
    }

    //Create OR exression Class
    public static IExpression getOrExpression(int left, int right) {
        IExpression leftExpression = new TerminalExpression(left);
        IExpression rightExpresion = new TerminalExpression(right);
        return new OrExpression(leftExpression, rightExpresion);
    }

    //Create NOT exression Class
    public static IExpression getNotExpression(int left) {
        IExpression leftExpression = new TerminalExpression(left);
        return new NotExpression(leftExpression);
    }
}
