import org.junit.Test;

import java.io.PrintStream;
import java.util.*;

import static org.mockito.ArgumentMatchers.contains;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by egonzale on 3/2/17.
 */
public class BookTest {

    @Test
    public void shouldPrintTitleWhenPrintingDetails() {
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("1984", "George Orwell", "1983", printStream);

        book.printDetails();

        verify(printStream).println(contains("1984"));
    }

    @Test
    public void shouldPrintAuthorWhenPrintingDetails() {
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("1984", "George Orwell", "1983", printStream);

        book.printDetails();

        verify(printStream).println(contains("George Orwell"));
    }

    @Test
    public void shouldPrintYearWhenPrintingDetails() {
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("1984", "George Orwell", "1983", printStream);

        book.printDetails();

        verify(printStream).println(contains("1983"));
    }
}
