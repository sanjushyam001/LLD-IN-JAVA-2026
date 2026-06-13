package LLD.patterns.iterator;

public class BookCollection {

    private Book books[];
    private int size = 0;

    public BookCollection(int intialCapicity) {
        this.books = new Book[intialCapicity];
    }

    public boolean addBook(Book book) {
        if (size > books.length - 1)
            return false;
        books[size++] = book;
        return true;
    }

    public MyIterator<Book> iterator() {
        return new BookIterator();
    }

    private class BookIterator implements MyIterator<Book> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Book next() {
            Book book = books[index++];
            return book;
        }

    }

}
