import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collections;
    private Library library;

    public Borrower (String name){
        this.name = name;
        this.collections = new ArrayList<>();
    }

    public int getCollectionsAmount(){
        return this.collections.size();
    }

    public void borrowBook(Book book){
//        this.library.lendBook(book);
        this.collections.add(book);
    }

}
