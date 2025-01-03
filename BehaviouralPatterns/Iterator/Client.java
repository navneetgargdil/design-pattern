package BehaviouralPatterns.Iterator;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        if(args[0].equals("1")) {
            System.out.println("Version 1");
            BookCollectionV1 bookCollection = new BookCollectionV1();
            bookCollection.addBook(new Book("C++ Book"));
            bookCollection.addBook(new Book("Java Book"));
            bookCollection.addBook(new Book("Python Book"));

            for(int i=0;i<bookCollection.getBooks().size();i++){
                System.out.println(bookCollection.getBooks().get(i));
            }
        }
        
        if(args[0].equals("2")) {
            System.out.println("Version 2");

            BookCollectionV2 bookCollectionv2 = new BookCollectionV2();
            bookCollectionv2.addBook(new Book("C++ Book"));
            bookCollectionv2.addBook(new Book("Java Book"));
            bookCollectionv2.addBook(new Book("Python Book"));

            Iterator<Book> iteratorv2 = bookCollectionv2.createIterator();
            while(iteratorv2.hasNext()){
                Book book = iteratorv2.next();
                System.out.println(book);
            }
        }

        if(args[0].equals("3")) {
            System.out.println("Version 3");
            BookCollectionV3 bookCollectionv3 = new BookCollectionV3();
            bookCollectionv3.addBook(new Book("Python Book"));
            bookCollectionv3.addBook(new Book("C++ Book"));
            bookCollectionv3.addBook(new Book("Java Book"));


            Iterator<Book> iteratorv3 = bookCollectionv3.iterator(); //Standardized

            while(iteratorv3.hasNext()){
                Book book = iteratorv3.next();
                System.out.println(book);
            }
        }

    }
}
