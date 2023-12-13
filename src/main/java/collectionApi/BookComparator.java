package collectionApi;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book b, Book c) {

        //sort by price
        // if price are equal sort by title
        int priceCompare = (int) (b.getPrice() - c.getPrice());
        if (priceCompare != 0) {
            return priceCompare;
        }
            return b.getTitle().compareTo(c.getTitle());



    }
}
