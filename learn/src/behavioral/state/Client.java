package behavioral.state;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(StateA.instance());
        context.request();
        context.request();
        context.request();
    }
}
