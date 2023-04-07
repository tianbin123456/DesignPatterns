package creational.builder;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class BankAccountant {
    public static void main(String[] args) {
        Loan build = new HouseLoanBuilder(100d).loanRate(20).loanPeriod(8).guarantees(1).build();
        System.out.println(build);
        Loan build1 = new PersonalLoanBuilder().loanAmount(200d).loanRate(20).loanPeriod(8).guarantees(1).build();
        System.out.println(build1);
    }
}
