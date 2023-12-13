package collectionApi.books;

import collectionApi.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<collectionApi.Book> {
    @Override
    public int compare(collectionApi.Book b, Book c) {

        //sort by price
        // if price are equal sort by title
        int priceCompare =Double.compare(b.getPrice(), c.getPrice());
        if (priceCompare != 0) {
            return priceCompare;
        }
            return b.getTitle().compareTo(c.getTitle());



    }
}
