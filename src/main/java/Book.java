import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by egonzale on 3/1/17.
 */
public class Book {
    private final String title;
    private final String author;
    private final String year;
    private final PrintStream printStream;

    public Book(String title, String author, String year, PrintStream printStream) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.printStream = printStream;
    }

    public String getTitle() {
        return title;
    }

    public void printDetails() {
        printStream.println(title + " | " + author + " | " + year);
    }
}
