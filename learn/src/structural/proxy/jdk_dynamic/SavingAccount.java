package structural.proxy.jdk_dynamic;

/**
 * @author tianbin
 * @date 2023/4/21
 * @Description
 * @since v1.0.0
 */
public class SavingAccount implements BankAccount {
    @Override
    public void debit() {
        System.out.println("Debit from Bank Account");
    }

    // Validate Account from Bank
    public boolean validate() {
        System.out.println("validate Bank Account");
        return true;
    }
}
