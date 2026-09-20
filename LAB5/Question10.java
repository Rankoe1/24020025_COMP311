// Question 10 - Putting It Together
public class Question10 {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Head First Java", "Kathy Sierra", 350.00));
        library.addBook(new Book("Clean Code", "Robert Martin", 420.50));
        library.addBook(new Book("Effective Java", "Joshua Bloch", 390.75));
        library.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", 480.00));

        library.printAllBooks();
    }
}
