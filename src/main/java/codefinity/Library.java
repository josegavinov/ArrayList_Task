package codefinity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
        
    }

    public void removeBookById(int id) {
        List<Book> remover = new ArrayList<>();
        for (Book book : library){
            if(book.getId() == id){
                remover.add(book);
            }
        library.removeAll(remover);
        }
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> books_author = new ArrayList<>();
        for(Book book : library){
            if(book.getAuthor().equals(author)){
                books_author.add(book);
            }

        }
        return books_author;
    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        List<Book> books_afterYear = new ArrayList<>();

        for (Book books : library){
            if (books.getYear() > year){
                books_afterYear.add(books);
            }
        }
        return books_afterYear;
    }

    public void displayAllBooks() {
        System.out.println(library);
    }
}
