package collectionApi;

import collectionApi.books.BookComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Dsa {
    public static void main(String[] args) {
       //
       // Collection

        // Collection
        // Iterable -> Collection
        // List // store an ordered collection of elements
        // Set // No duplicate elements
        // Queue // FIFO first IN First OUt
        //Map // key/value pairs

        //

        ArrayList<Integer> numList = new ArrayList<>();
       // add a new element add()
        numList.add(50);
        numList.add(10);
        numList.add(20);
        numList.add(25);
        numList.add(2,15);

        System.out.println(numList.get(0));
        numList.remove(2);
        System.out.println("Checking for list contains element 10 "+numList.contains(10));

        System.out.println("Checking if list has elements "+numList.isEmpty());

        System.out.println(numList);


        //
        System.out.println("size of the list is " + numList.size());

        //

        ArrayList<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Olive");
        names.add("Lilly");
        names.add("John");
//        names.add(null);
//        names.add(null);

        ArrayList<String> bNames = new ArrayList<>();
        bNames.add("bob");
        bNames.add("Ben");
        bNames.add("Bashir");

        names.addAll(bNames);

        System.out.println(names);

        Collections.sort(names);
        System.out.println("Sorted List ");
        System.out.println(names);


        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book(1,"DSA","Chris",39.99);
        Book b2 = new Book(2,"HTML","Bob",39.99);
        Book b3 = new Book(4,"CSS","John",100.99);
        Book b4 = new Book(10,"Spring Boot","Adam",11.99);







        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        for(Book b : books){
            System.out.println(b);
        }

        System.out.println("List of sorted books");


        //sort books by price
Collections.sort(books, new BookComparator());



        for(Book b : books){
            System.out.println(b);
        }




    }
}
