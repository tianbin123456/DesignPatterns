package behavioral.state;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class StateA implements State {

    private static StateA instance = new StateA();

    public static StateA instance() {
        return instance;
    }

    @Override
    public void handle(Context context) {
        System.out.println("进入状态A");
        context.setCurrentState(StateB.instance());
    }
}
