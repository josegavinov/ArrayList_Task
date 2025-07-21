package codefinity;

import java.util.List;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", 2019));
        library.addBook(new Book("Effective Java", "Joshua Bloch", 2020));
        library.addBook(new Book("Clean Code", "Robert C. Martin", 2008));

        System.out.println("All books in the library:");
        library.displayAllBooks();

        library.removeBookById(2);  // Assuming book with id 2 needs to be removed

        System.out.println("\nAfter removing a book:");
        library.displayAllBooks();

        System.out.println("\nBooks by author 'Joshua Bloch':");
        List<Book> booksByAuthor = library.findBooksByAuthor("Herbert Schildt");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }

        System.out.println("\nBooks published after 2010:");
        List<Book> booksAfter2010 = library.findBooksPublishedAfterYear(2010);
        for (Book book : booksAfter2010) {
            System.out.println(book);
        }
    }
}
