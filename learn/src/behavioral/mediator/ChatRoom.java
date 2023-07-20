package behavioral.mediator;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public interface ChatRoom {
    void sendMessage(String msg, String userId);
    void addUser(User user);
}
