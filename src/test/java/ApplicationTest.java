import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class ApplicationTest {

    private PrintStream out;
    private Biblioteca biblioteca;
    private Menu menu;

    @Before
    public void setUp(){
        out = mock(PrintStream.class);
        biblioteca = mock(Biblioteca.class);
        menu = mock(Menu.class);
    }

    @Test
    public void shouldPrintWelcomeMessageWhenApplicationStarts() {
        Application app = new Application(out, biblioteca, menu);
        app.start();
        verify(out).println("Welcome");
    }


    @Test
    public void shouldPrintMenuOptionsWhenStarting() {
        Application app = new Application(out, biblioteca, menu);
        app.start();
        verify(menu).displayMenu();
    }

    @Test
    public void shouldCallListBooksWhenSelectingListOptionInMenu() {

    }
}