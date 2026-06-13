package LLD.patterns.iterator;

public class BookCollectionTest {

    public static void main(String[] args) {

        BookCollection collection = new BookCollection(10);

        collection.addBook(new Book(1, "CORE JAVA"));
        collection.addBook(new Book(2, "SPRING"));

        MyIterator<Book> it = collection.iterator();
        // Book book = (Book) it.next();
        // System.out.println(book);
        // boolean result = it.hasNext();
        // System.out.println(result);
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book);

        }
    }
}
