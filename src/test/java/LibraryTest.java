import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;


    @Before
    public void before(){
        library = new Library(100);
        book1 = new Book("Harry Potter and the Sorcerer's Stone", "JK Rowling", "Fantasy");
        book2 = new Book("The Secret Garden", "Fances Hodgson Burnett", "Fictional");

    }

    @Test
    public void hasCapacity(){
        assertEquals(100,library.getCapacity());
    }

    @Test
    public  void canAddBook(){
        this.library.addBook(book1);
        assertEquals(1,this.library.getNumberOfBook());
    }
    @Test
    public void canLendBook(){
        this.library.addBook(book1);
        this.library.addBook(book2);
        this.library.lendBook(book1);
        assertEquals(1,this.library.getNumberOfBook());
    }
}
