package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianbin
 * @date 2023/7/17
 * @Description
 * @since v1.0.0
 */
public class RepositoryCareTaker {

    private List<FileMemento> mementoList = new ArrayList<>();

    public void add(FileMemento fileMemento) {
        mementoList.add(fileMemento);
    }

    public FileMemento get(int index) {
        return mementoList.get(index);
    }
}
