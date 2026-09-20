// Question 8 - Comparing Objects
public class Question8 {

    // Returns whichever book has the lower price
    public static Book cheaperBook(Book a, Book b) {
        if (a.getPrice() <= b.getPrice()) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Head First Java", "Kathy Sierra", 350.00);
        Book b2 = new Book("Clean Code", "Robert Martin", 420.50);

        Book cheaper = cheaperBook(b1, b2);
        System.out.println("The cheaper book is: " + cheaper.getSummary());
    }
}
