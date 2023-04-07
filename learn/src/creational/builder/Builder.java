package creational.builder;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public abstract class Builder {
    double loanAmount;
    double loanRate;
    int loanPeriod;
    int guarantees;

    public abstract Loan build();
}
