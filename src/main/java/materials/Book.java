package materials;
import abstractclasses.LibraryMaterial;
import interfaces.Loanable;
import interfaces.Catalogable;

// Definition of extended class. In spanish its called "Libro"
public class Book extends LibraryMaterial implements Loanable, Catalogable {

    // Additional attributes
    private String author;
    private String editor;
    private String isbn;

    // Constructor
    public Book(String author, String editor, String isbn) {
        this.author = author;
        this.editor = editor;
        this.isbn = isbn;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Implementation of abstract methods of Materials.LibraryMaterial class
    @Override
    public void calculateLoanTime() {

    }

    @Override
    public void generateCatalogCode() {

    }

    // Implementing Loanable interface methods
    @Override
    public void lend() {

    }

    @Override
    public void returnIt() {

    }

    @Override
    public boolean isLoan() {
        return false;
    }

    // Implementing Catalogable interface methods
    @Override
    public String getCatalogInfo() {
        return "";
    }
}
