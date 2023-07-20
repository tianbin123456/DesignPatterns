package behavioral.memento;

/**
 * @author tianbin
 * @date 2023/7/17
 * @Description
 * @since v1.0.0
 */
public class FileMemento {

    private String id;
    private String name;
    private String content;

    public FileMemento(String id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
