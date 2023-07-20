package behavioral.memento;

/**
 * @author tianbin
 * @date 2023/7/17
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        FileOriginator fileOriginator = new FileOriginator("1", "test");
        RepositoryCareTaker repositoryCareTaker = new RepositoryCareTaker();
        fileOriginator.setContent("a");
        repositoryCareTaker.add(fileOriginator.tagMemento());
        fileOriginator.setContent("b");
        repositoryCareTaker.add(fileOriginator.tagMemento());
        fileOriginator.setContent("c");
        repositoryCareTaker.add(fileOriginator.tagMemento());
        System.out.println(fileOriginator);
        fileOriginator.restore(repositoryCareTaker.get(1));
        System.out.println(fileOriginator);
    }

}
