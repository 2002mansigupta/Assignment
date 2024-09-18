package  anudip;
public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor with just the title
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with title, author, and price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter and setter methods
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

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;
    }

    public static void main(String[] args) {
        // Creating a Book object with just the title
        Book book1 = new Book("To Kill a Mockingbird");
        System.out.println(book1);

        // Creating a Book object with the title and author
        Book book2 = new Book("1984", "George Orwell");
        System.out.println(book2);

        // Creating a Book object with the title, author, and price
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        System.out.println(book3);
    }
}
