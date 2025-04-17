package materials;
import abstractclasses.LibraryMaterial;

// Definition of extended class. In spanish its called "Libro"
public class Book extends LibraryMaterial {

    // Additional attributes
    private String author;
    private String editor;
    private String isbn;

    // Implementation of abstract methods of Materials.LibraryMaterial class
    @Override
    public void calculateLoanTime() {

    }

    @Override
    public void generateCatalogCode() {

    }
}
