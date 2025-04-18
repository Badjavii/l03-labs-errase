package materials;
import abstractclasses.LibraryMaterial;
import interfaces.Catalogable;
import interfaces.Loanable;

// Definition of extended class. In spanish its called "Revista"
public class Magazine extends LibraryMaterial implements Loanable, Catalogable {

    // Atributos Adicionales
    private int volume;
    private int editor;
    private String issn;

    // Constructor
    public Magazine(int volume, int editor, String issn) {
        this.volume = volume;
        this.editor = editor;
        this.issn = issn;
    }

    // Getters
    public int getVolume() {
        return volume;
    }

    public int getEditor() {
        return editor;
    }

    public String getIssn() {
        return issn;
    }

    // Setters
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setEditor(int editor) {
        this.editor = editor;
    }

    public void setIssn(String issn) {
        this.issn = issn;
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
