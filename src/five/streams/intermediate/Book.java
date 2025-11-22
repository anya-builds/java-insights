package five.streams.intermediate;

public class Book {
    String title;
    int publicationYear;
    double price;
    String category;

    public Book(String title, String category, double price, int publicationYear) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.publicationYear = publicationYear;
    }
}
