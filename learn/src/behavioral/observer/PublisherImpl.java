package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public class PublisherImpl implements Publisher {
    private String acct;
    private double balance;
    private List<Observer> myObservers;
    public PublisherImpl(String anAcct, double aBalance) {
        acct = anAcct;
        balance = aBalance;
        myObservers = new ArrayList();
    }
    @Override
    public void addObserver(Observer o){
        myObservers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        myObservers.remove(o);
    }
    @Override
    public void notify(double amt) {
        balance -= amt;
        if(balance < 0) {
            overdrawn();
        }
    }
    private void overdrawn() {
        for (Observer o: myObservers) {
            o.notify(acct, balance);
        }
    }
}
