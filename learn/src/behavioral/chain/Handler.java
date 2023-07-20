package behavioral.chain;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public interface Handler {
    void setNext(Handler next);
    void handle(Request request);
}
