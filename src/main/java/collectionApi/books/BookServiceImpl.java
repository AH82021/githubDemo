package collectionApi.books;

import collectionApi.books.Book;
import collectionApi.books.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private  List<Book> books;

    public BookServiceImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
      books.add(book);
        System.out.println("book added successfully ");

    }

    @Override
    public void removeBookByAuthor(String author) {
        for (Book b : books) {
            System.out.println(b.getAuthor());
            if(b.getAuthor().equalsIgnoreCase(author)){
                books.remove(b);
                System.out.println("Book removed successfully ");
                return;
            }
        }

    }

    @Override
    public void updateBook(String title, Book book) {
        for (Book b : books) {
            if(b.getTitle().equals(title)){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
                b.setPrice(book.getPrice());
            } else System.out.println("Book with title " + title + " not found");
        }
    }

    @Override
    public void displayBooks() {
 if(books.isEmpty()){
     System.out.println("No book found");
 } else
     for (Book book : books) {
         System.out.println(book);
     }
    }
}
