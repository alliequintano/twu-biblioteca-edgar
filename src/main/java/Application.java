import java.io.PrintStream;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class Application {

    private PrintStream out;
    private Biblioteca biblioteca;

    public Application(PrintStream out, Biblioteca biblioteca){
        this.out = out;
        this.biblioteca = biblioteca;
    }

    public void start() {
        out.println("Welcome");
        int option = createMenu();

        //Menu to instatiate or w/e
        //Choose an Option:
        //1. List books by name
        //2. List books with details

    }

    public int createMenu() {
        out.println("Menu");
        out.println("1. List Books");

        return 0;
    }
}
