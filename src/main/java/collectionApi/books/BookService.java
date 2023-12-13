package collectionApi.books;

public interface BookService {

    void  addBook(Book book);
    void removeBookByAuthor(String author);
    void updateBook(String title, Book book);

    void displayBooks();




}
