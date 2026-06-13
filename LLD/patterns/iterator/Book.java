package LLD.patterns.iterator;

public class Book {

    private int bookId;
    private String bookTitile;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitile() {
        return bookTitile;
    }

    public void setBookTitile(String bookTitile) {
        this.bookTitile = bookTitile;
    }

    public Book(int bookId, String bookTitile) {
        this.bookId = bookId;
        this.bookTitile = bookTitile;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookTitile=" + bookTitile + "]";
    }

}
