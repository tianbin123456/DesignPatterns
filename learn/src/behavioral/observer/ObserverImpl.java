package behavioral.observer;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public class ObserverImpl implements Observer {
    private String who;

    public ObserverImpl(String who) {
        this.who = who;
    }

    @Override
    public void notify(String acct, double amt) {
        System.out.println(who + "=== 接收到通知：账户：" + acct + " 账单：" + amt);
    }
}
