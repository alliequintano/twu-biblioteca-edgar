import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by egonzale on 3/2/17.
 */
public class BookTest {

    @Test
    public void shouldGetBookDetails() {
        Book book = new Book("Green Eggs and Ham", "Dr. Suess", "1890");

        Map<String, String> details = book.getBookDetails();

        List<String> keys = new ArrayList<String>(Arrays.asList("author", "title", "year"));

        assert(details.keySet().containsAll(keys));
    }
}
