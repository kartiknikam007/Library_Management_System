package libraryPackage;
//1. ** Book Class **: Represents a book with attributes such as title, author, ISBN(International Standard Book Number. 
//It's a unique 13-digit number that identifies books and other book-like publications that are published internationally.),
// and availability status.
import java.util.ArrayList;
import java.util.List;

public class Book
{
	private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // Default availability
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", ISBN=" + isbn + ", Available=" + isAvailable + "]";
    }

}
