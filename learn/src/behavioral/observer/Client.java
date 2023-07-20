package behavioral.observer;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Publisher account = new PublisherImpl("TEST123", 10.00);
        Observer bill = new ObserverImpl("s1");
        Observer bill2 = new ObserverImpl("s2");
        account.addObserver(bill);
        account.addObserver(bill2);
        account.notify(11.00);
    }
}
