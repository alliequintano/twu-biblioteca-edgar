import java.io.PrintStream;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class Application {

    private PrintStream out;
    private Biblioteca biblioteca;
    private Menu menu;

    public Application(PrintStream out, Biblioteca biblioteca, Menu menu){
        this.out = out;
        this.biblioteca = biblioteca;
        this.menu = menu;
    }

    public void start() {
        out.println("Welcome");
        menu.displayMenu();
    }
}
