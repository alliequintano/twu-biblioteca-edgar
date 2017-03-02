import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
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
        books.add(new Book("1984", "George Orwell", "1983"));
        books.add(new Book("Green Eggs and Ham", "Dr. Suess", "1904"));
        books.add(new Book("Sex at Dawn", "IDK", "1987"));
    }

    public void start() {
        out.println("Welcome");
    }

    public void listBooks() {
        for(Book book : books) {
            out.println(book.getTitle());
        }
    }

    public void listDetails() {
    }
}
