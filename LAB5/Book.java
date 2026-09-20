// Questions 1, 2, 4 and 5 - final version of the Book class
public class Book {

    // Q1 + Q5: fields, made private for encapsulation
    private String title;
    private String author;
    private double price;

    // Q2: constructor - 'this' separates the fields from the parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Q4: summary method
    public String getSummary() {
        return title + " by " + author + " - P" + price;
    }

    // Q5: getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
