# Let's Practice!

Your task is to implement a **library management system** in Java. A `Book` class has already been created for you with all the fields, **setters, and getters**. You can familiarize yourself with it in the `Book` class.

Also, a `LibraryDemo` class has been created for you, which tests all the methods from the `Library` class.

Create a class `Library` that represents a collection of books. Use an `ArrayList` to store instances of the `Book` class.

Implement the following methods in the `Library` class:

- `addBook(Book book)`: Adds a book to the library.
- `removeBookById(int id)`: Removes a book from the library based on the unique identifier.
- `findBooksByAuthor(String author)`: Returns a list of books by the specified author.
- `findBooksPublishedAfterYear(int year)`: Returns a list of books published after the specified year.
- `displayAllBooks()`: Displays information about all the books in the library on the screen.

After that, you need to go to the `LibraryDemo` class and run it. It will **test the correctness of the methods** you implemented.


## Task Execution Guide:

Your main task is to implement the `Library` class, specifically its methods. Firstly, you need to create a list of `books`, which will be your library.

- Start with the simplest method – the method to add a book to the library. Here, you simply need to use the `add()` method on the list you created earlier.

- Proceed with the `removeBookById()` method, which is a **bit more complex** than it seems. You cannot simply remove a book using `remove(id)` since each book **has a unique identifier specified in the class**. Therefore, you need to create a separate list of books to be removed. Then, iterate through the list of books and find the book by ID using a condition like `if(book.getId() == id)`. Afterward, use the `removeAll()` method with the list of books to be removed.

- The `findBookByAuthor()` method is almost identical to the previous one; I'll leave this one for you to contemplate.

- The `findBooksPublishedAfterYear()` method is similar to the previous one; you just need to **change the condition**.

- In the `displayAllBooks()` method, simply use `System.out.println()`.

Don't forget that in some methods, you need to `return` lists. A list, like any other object, can be a return value.