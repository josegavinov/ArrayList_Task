import codefinity.Book;
import codefinity.Library;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testRemoveBookById() {
        library.books.clear();
        Book bookToRemove = new Book( "Title", "Author", 2022);
        library.addBook(bookToRemove);

        library.removeBookById(4);
        assertFalse(library.books.contains(bookToRemove));
    }

    @Test
    public void testAddBook() {
        library.books.clear();
        Book book = new Book( "Title", "Author", 2022);
        library.addBook(book);
        assertTrue(library.books.contains(book));
    }

    @Test
    public void testFindBooksByAuthor() {
        library.books.clear();
        Book book1 = new Book( "Title1", "Author", 2022);
        Book book2 = new Book( "Title2", "Author", 2023);
        library.addBook(book1);
        library.addBook(book2);

        List<Book> booksByAuthor = library.findBooksByAuthor("Author");
        assertEquals(2, booksByAuthor.size());
        assertTrue(booksByAuthor.contains(book1));
        assertTrue(booksByAuthor.contains(book2));
    }

    @Test
    public void testFindBooksPublishedAfterYear() {
        library.books.clear();
        Book book1 = new Book( "Title1", "Author", 2022);
        Book book2 = new Book( "Title2", "Author", 2023);
        library.addBook(book1);
        library.addBook(book2);

        List<Book> booksPublishedAfter2022 = library.findBooksPublishedAfterYear(2022);
        assertEquals(1, booksPublishedAfter2022.size());
        assertTrue(booksPublishedAfter2022.contains(book2));
    }

    @Test
    public void testDisplayAllBooks() {
        library.books.clear();
        Book book1 = new Book( "Title1", "Author1", 2022);
        Book book2 = new Book( "Title2", "Author2", 2023);
        library.addBook(book1);
        library.addBook(book2);

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        library.displayAllBooks();

        // Reset System.out
        System.setOut(System.out);

        assertEquals("[Book{title='Title1', author='Author1', year=2022, id=5}, Book{title='Title2', author='Author2', year=2023, id=6}]\n", outputStream.toString());
    }
}
