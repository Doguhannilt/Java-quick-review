package OOP.Encapsulation;

public class Book {
    public String name, author, publisher;
    private int numberOfPage;


    public Book(String name, String author, String publisher, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if(numberOfPage > 0) {
            this.numberOfPage = numberOfPage;
        } else {
            this.numberOfPage = 0;
        }
    }
}
