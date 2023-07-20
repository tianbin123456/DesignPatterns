package behavioral.strategy;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        LoanContext loanContext = new LoanContext();
        loanContext.setLoanStrategy(new LoanScheme1());
        loanContext.process(100d);
        loanContext.setLoanStrategy(new LoanScheme2());
        loanContext.process(200d);
        loanContext.setLoanStrategy(new LoanScheme3());
        loanContext.process(300d);
    }
}
