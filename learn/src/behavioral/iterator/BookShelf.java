package behavioral.iterator;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public class BookShelf implements Aggregate {
    Book[] books;
    int pointer = 0;

    public BookShelf(int max_size) {
        books = new Book[max_size];
    }

    public void appendBook(Book book) {
        books[pointer] = book;
        pointer++;
    }

    public Book findBookAt(int index) {
        return books[index];
    }

    public int getLength() {
        return pointer;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
