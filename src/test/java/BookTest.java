import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    Book book1;
    @Before

    public void before(){
         book1 = new Book("Harry Potter and the Sorcerer's Stone", "JK Rowling", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Harry Potter and the Sorcerer's Stone",book1.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("JK Rowling",book1.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("Fantasy",book1.getGenre());
    }



}
