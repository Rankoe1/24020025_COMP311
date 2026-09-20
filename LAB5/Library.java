import java.util.ArrayList;

// Question 9 - A Class That Uses Another Class
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void printAllBooks() {
        for (Book b : books) {
            System.out.println(b.getSummary());
        }
    }
}
