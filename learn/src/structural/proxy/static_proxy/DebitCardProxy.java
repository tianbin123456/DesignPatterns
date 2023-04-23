package structural.proxy.static_proxy;

/**
 * @author tianbin
 * @date 2023/4/21
 * @Description
 * @since v1.0.0
 */
public class DebitCardProxy implements BankAccount {


    SavingAccount savingAccount;

    @Override
    public void debit() {
        if(savingAccount==null){
            savingAccount = new SavingAccount();
        }
        if(!savingAccount.validate()){
            return;
        }
        savingAccount.debit();
    }
}
