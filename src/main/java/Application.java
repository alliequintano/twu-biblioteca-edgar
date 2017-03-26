import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class Application {

    private BufferedReader in;
    private PrintStream out;
    private Biblioteca biblioteca;
    private Menu menu;

    public Application(BufferedReader in, PrintStream out, Biblioteca biblioteca, Menu menu){
        this.in = in;
        this.out = out;
        this.biblioteca = biblioteca;
        this.menu = menu;
    }

    public void start() throws IOException {
        out.println("Welcome");
        menu.displayMenu();
        String selection = in.readLine();
        while (!isValidMenuOption(selection)) {
            out.println("Select a valid option!");
            selection = in.readLine();
        }
        processMenuOption();
    }

    private void processMenuOption() throws IOException {
        biblioteca.listBooks();
    }

    private boolean isValidMenuOption(String selection) {
        if (selection != null && selection.equals("1")) {
            return true;
        }
        return false;
    }
}
