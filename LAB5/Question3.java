// Question 3 - Creating Objects
public class Question3 {
    public static void main(String[] args) {
        Book b1 = new Book("Head First Java", "Kathy Sierra", 350.00);
        Book b2 = new Book("Clean Code", "Robert Martin", 420.50);

        // Fields are private (Q5), so we use the getters
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Price: " + b1.getPrice());
        System.out.println();
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("Price: " + b2.getPrice());
    }
}
