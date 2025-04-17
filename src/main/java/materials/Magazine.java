package materials;
import abstractclasses.LibraryMaterial;

// Definition of extended class. In spanish its called "Revista"
public class Magazine extends LibraryMaterial {

    // Atributos Adicionales
    private int volume;
    private int editor;
    private String issn;


    // Implementacion de metodos abstractos
    @Override
    public void calculateLoanTime() {

    }

    @Override
    public void generateCatalogCode() {

    }
}
