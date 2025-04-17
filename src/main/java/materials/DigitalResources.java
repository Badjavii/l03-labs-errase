package materials;
import abstractclasses.LibraryMaterial;

// Definition of extended class. In spanish its called "RecursosDigitales"
public class DigitalResources extends LibraryMaterial {

    // Atributos Adicionales
    private String url;
    private String format;
    private int size;



    // Implementation of abstract methods of Materials.LibraryMaterial class
    @Override
    public void calculateLoanTime() {

    }

    @Override
    public void generateCatalogCode() {

    }
}