package behavioral.mediator;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public abstract class User {
    private ChatRoom mediator;
    private String id;
    private String name;
    public User(ChatRoom room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }
    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);
    public ChatRoom getMediator() {
        return mediator;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
