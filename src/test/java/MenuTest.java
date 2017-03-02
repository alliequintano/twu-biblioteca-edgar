import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class MenuTest {

    @Test
    public void shouldPrintMenuOptions() {
        PrintStream out = mock(PrintStream.class);
        Menu menu = new Menu(out);

        menu.displayMenu();

        verify(out).println(contains("List Books"));
    }

}