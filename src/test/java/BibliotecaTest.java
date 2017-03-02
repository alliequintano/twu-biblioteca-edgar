import org.junit.Test;
import org.mockito.Mock;

import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by egonzale on 3/1/17.
 */
public class BibliotecaTest {

    private PrintStream out = mock(PrintStream.class);

    @Test
    public void shouldPrintWelcomeMessageWhenApplicationStarts() {
        Biblioteca app = new Biblioteca(out);
        app.start();
        verify(out).println("Welcome");
    }

    @Test
    public void shouldPrintOutNamesOfBooks() {
        Biblioteca app = new Biblioteca(out);
        app.listBooks();
        verify(out).println(contains("1984"));
        verify(out).println(contains("Sex at Dawn"));
        verify(out).println(contains("Green Eggs and Ham"));
    }
//
//    @Test
//    public void shouldCallBookFormattedOutputWhenListingBooksDetails() {
//        Biblioteca app = new Biblioteca(out);
//        Book book = mock(Book.class);
//
//        app.listDetails();
//
//        verify(book).formattedOutput();
//    }

}