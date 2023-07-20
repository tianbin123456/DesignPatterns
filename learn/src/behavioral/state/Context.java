package behavioral.state;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class Context {
    private State currentState;

    public Context(State currentState) {
        this.currentState = currentState;
        if (null == currentState) {
            this.currentState = StateA.instance();
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void request() {
        currentState.handle(this);
    }
}
