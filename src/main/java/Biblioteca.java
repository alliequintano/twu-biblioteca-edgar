import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by egonzale on 3/1/17.
 */
public class Biblioteca {
    private PrintStream out;
    private List<Book> books;

    public Biblioteca(PrintStream out) {
        this.out = out;
        books = new ArrayList<Book>();
        books.add(new Book("1984", "George Orwell", "1983", out));
        books.add(new Book("Green Eggs and Ham", "Dr. Suess", "1904", out));
        books.add(new Book("Sex at Dawn", "IDK", "1987", out));
    }

    public void start() {
        out.println("Welcome");
        int option = createMenu();

        //Menu to instatiate or w/e
        //Choose an Option:
        //1. List books by name
        //2. List books with details

    }

    public void listBooks() {
        out.println("Titles");
        for(Book book : books) {
            book.printTitle();
        }
    }

    public void listDetails() {
        out.println("Title | Author | Year");
        for(Book book : books) {
            book.printDetails();
        }
    }

    public int createMenu() {
        out.println("Menu");
        out.println("1. List Books");

        return 0;
    }
}
