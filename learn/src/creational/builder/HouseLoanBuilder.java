package creational.builder;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class HouseLoanBuilder extends Builder {

    public HouseLoanBuilder(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public HouseLoanBuilder loanRate(double loanRate) {
        this.loanRate = loanRate;
        return this;
    }

    public HouseLoanBuilder loanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
        return this;
    }

    public HouseLoanBuilder guarantees(int guarantees) {
        this.guarantees = guarantees;
        return this;
    }

    @Override
    public Loan build() {
        Loan loan = new Loan(this);
        return loan;
    }
}
