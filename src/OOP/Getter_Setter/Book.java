package OOP.Getter_Setter;

public class Book {
    private String name, author, publisher;
    private int numberOfPage;


    public Book(String name, String author, String publisher, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if (numberOfPage > 0) {
            this.numberOfPage = numberOfPage;
        } else {
            this.numberOfPage = 0;
        }
    }
    
    // Getters and Setters
    public int getNumberOfPage() {
        return this.numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        if (numberOfPage > 0) {
            this.numberOfPage = numberOfPage;
        }
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    

}
