import java.util.HashMap;
import java.util.Map;

/**
 * Created by egonzale on 3/1/17.
 */
public class Book {
    private final String title;
    private final String author;
    private final String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Map<String, String> getBookDetails() {
        Map<String, String> bookDetails = new HashMap<>();
        bookDetails.put("title", title);
        bookDetails.put("author", author);
        bookDetails.put("year", year);
        return bookDetails;
    }
}
