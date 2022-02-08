import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> stocks;

    public Library(int capacity){
        this.capacity = capacity;
        this.stocks = new ArrayList<>();

    }
    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfBook(){
        return this.stocks.size();
    }

    public void addBook(Book book){
        if(stocks.size() < this.capacity)
         this.stocks.add(book);
    }

    public void lendBook(Book book){
        if (this.stocks.size() > 0){
            this.stocks.remove(book);
        }
    }

    public boolean checkIfFull(){
        return this.stocks.size() > this.capacity;
    }

}
