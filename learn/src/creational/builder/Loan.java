package creational.builder;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class Loan {
    private double loanAmount;
    private double loanRate;
    private int loanPeriod;
    private int guarantees;

    public Loan() {

    }

    public Loan(Builder loanBuilder) {
        this.loanAmount = loanBuilder.loanAmount;
        this.loanRate = loanBuilder.loanRate;
        this.loanPeriod = loanBuilder.loanPeriod;
        this.guarantees = loanBuilder.guarantees;
    }

    @Override
    public String toString() {
        return "Build a Loan with rate " + this.loanRate + "%, period "
                + this.loanPeriod + " month for " + this.loanAmount + "$ ";
    }
}
