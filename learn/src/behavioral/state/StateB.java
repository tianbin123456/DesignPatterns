package behavioral.state;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class StateB implements State {

    private static StateB instance = new StateB();

    public static StateB instance() {
        return instance;
    }

    @Override
    public void handle(Context context) {
        System.out.println("进入状态B");
        context.setCurrentState(this);
    }
}
