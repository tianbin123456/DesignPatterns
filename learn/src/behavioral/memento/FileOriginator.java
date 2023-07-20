package behavioral.memento;

/**
 * @author tianbin
 * @date 2023/7/17
 * @Description
 * @since v1.0.0
 */
public class FileOriginator {

    private String id;

    private String name;

    private String content;

    public FileOriginator(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public FileMemento tagMemento() {
        FileMemento fileMemento = new FileMemento(id, name, content);
        return fileMemento;
    }

    public void restore(FileMemento fileMemento) {
        this.id = fileMemento.getId();
        this.name = fileMemento.getName();
        this.content = fileMemento.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FileOriginator{"
                + " id=" + id
                + ", name=" + name
                + ", content=" + content
                + '}';
    }
}
