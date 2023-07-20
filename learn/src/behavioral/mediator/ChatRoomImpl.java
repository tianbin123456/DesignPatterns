package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public class ChatRoomImpl implements ChatRoom {
    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId) {
        User u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}
