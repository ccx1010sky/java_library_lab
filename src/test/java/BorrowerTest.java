import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private  Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        borrower = new Borrower("John");
        library = new Library(100);
        book1 = new Book("Harry Potter and the Sorcerer's Stone", "JK Rowling", "Fantasy");
        book2 = new Book("The Secret Garden", "Fances Hodgson Burnett", "Fictional");
    }
    @Test
    public void canBorrowBook() {
          this.borrower.borrowBook(book1);
          this.borrower.borrowBook(book2);
        assertEquals(2, this.borrower.getCollectionsAmount());
    }

}
