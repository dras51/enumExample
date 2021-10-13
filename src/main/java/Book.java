import java.util.ArrayList;

public class Book {
    private int year;
    private float price;
    private String title;
    private ArrayList<Author> authors;
    private GenreType genre;

    public Book(int year, float price, String title, GenreType genre) {
        this.year = year;
        this.price = price;
        this.title = title;
        this.authors = new ArrayList<>();
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public GenreType getGenre() {
        return genre;
    }

    public void updateAuthors(Author author) {
        authors.add(author);
    }

}

   