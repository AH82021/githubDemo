package collectionApi.books;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookApp {

    public static Book createBook(Scanner sc){
        System.out.println("Please enter title of the book");
        String title = sc.nextLine();
        System.out.println("Please enter author of the book");
        String author = sc.nextLine();
        System.out.println("Please enter price of the book");
        double price = sc.nextDouble();

        Book b = new Book(title, author, price);
        return b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookServiceImpl service = new BookServiceImpl();




        int choice ;
        boolean menu = true;

        try {

            do {
                System.out.println("""
                Welcome to Logic Book Store 📚
                please choose from the following options: 
                1- Add a new book 
                2- Remove a book 
                3- Update a book 
                4- Display All Books 
                5- Exit the App.
                """);
                choice = sc.nextInt();
                switch (choice) {
                    case 1 :
                        sc.nextLine();
                        Book b = createBook(sc);
                        service.addBook(b);
                        service.displayBooks();
                        break;
                     case 2 :
                         sc.nextLine();
                  service.displayBooks();

                         System.out.println("Please enter author of the book ");
                         String author = sc.nextLine();
                         service.removeBookByAuthor(author);
                         break;
                      case 3 :


                          break;

                    case 4:
                        System.out.println("List of books ");
                        service.displayBooks();
                        break;

                    case 5:
                        System.out.println("Bye bye ");
                        menu = false;
                        break;

                }


            }while (menu);

        } catch(InputMismatchException e) {
            System.out.println("Wrong input try again ");
        }

    }
}
