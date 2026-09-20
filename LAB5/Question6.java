// Question 6 - An Array of Objects
public class Question6 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Head First Java", "Kathy Sierra", 350.00);
        books[1] = new Book("Clean Code", "Robert Martin", 420.50);
        books[2] = new Book("Effective Java", "Joshua Bloch", 390.75);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getSummary());
        }
    }
}
