package behavioral.strategy;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class LoanScheme1 implements LoanStrategy {
    @Override
    public void processLoan(double d) {
        System.out.println("LoanScheme1==" + d);
    }
}
