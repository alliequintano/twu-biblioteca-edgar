/**
 * Created by egonzale on 3/1/17.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca app = new Biblioteca(System.out);
        app.start();
        app.listBooks();
        app.listDetails();
    }
}
