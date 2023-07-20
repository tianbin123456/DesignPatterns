package behavioral.strategy;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class LoanContext {

    private LoanStrategy loanStrategy;

    public void setLoanStrategy(LoanStrategy loanStrategy) {
        this.loanStrategy = loanStrategy;
    }

    public void process(double d) {
        loanStrategy.processLoan(d);
    }
}
