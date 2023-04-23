package structural.proxy.jdk_dynamic;

import structural.proxy.static_proxy.DebitCardProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tianbin
 * @date 2023/4/21
 * @Description
 * @since v1.0.0
 */
public class ProxyClient {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BankAccount account = new SavingAccount();
        MyHandler myHandler = new MyHandler(account);
        BankAccount proxyInstance = (BankAccount) Proxy.newProxyInstance(BankAccount.class.getClassLoader(), account.getClass().getInterfaces(), myHandler);
        proxyInstance.debit();
    }

}
