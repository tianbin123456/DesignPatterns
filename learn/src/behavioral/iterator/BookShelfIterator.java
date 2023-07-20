package behavioral.iterator;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public class BookShelfIterator implements Iterator {
    BookShelf bookShelf;
    int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < this.bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return bookShelf.findBookAt(index++);
    }

}
