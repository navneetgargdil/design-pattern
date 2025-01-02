package BehaviouralPatterns.Iterator;

public class Book implements Comparable<Book> {
    private String title;

    public Book(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }


    
}
