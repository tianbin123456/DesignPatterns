package structural.proxy.static_proxy;

import structural.proxy.static_proxy.BankAccount;
import structural.proxy.static_proxy.DebitCardProxy;

/**
 * @author tianbin
 * @date 2023/4/21
 * @Description
 * @since v1.0.0
 */
public class ProxyClient {
    public static void main(String[] args) {
        BankAccount debitCardProxy = new DebitCardProxy();
        debitCardProxy.debit();
    }

}
