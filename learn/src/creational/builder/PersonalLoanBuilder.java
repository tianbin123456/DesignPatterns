package creational.builder;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class PersonalLoanBuilder extends Builder {

    public PersonalLoanBuilder() {
    }

    public PersonalLoanBuilder loanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }

    public PersonalLoanBuilder loanRate(double loanRate) {
        this.loanRate = loanRate;
        return this;
    }

    public PersonalLoanBuilder loanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
        return this;
    }

    public PersonalLoanBuilder guarantees(int guarantees) {
        this.guarantees = guarantees;
        return this;
    }

    @Override
    public Loan build() {
        Loan loan = new Loan(this);
        return loan;
    }
}
