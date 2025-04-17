package abstractclasses;

// Definition of abstract class. In spanish its called "MaterialLibreria"
public abstract class LibraryMaterial {
    private int id;
    private int year;
    private String title;
    private boolean available;

    // Definition of abstract method. In spanish its called "calcularTiempoPrestamo"
    public abstract void calculateLoanTime();

    // Definition of abstract method. In spanish its called "generarCodigoCatalogo"
    public abstract void generateCatalogCode();


    // Getter and setters definition for Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and setters definition for Year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and setters definition for Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.titulo = titulo;
    }

    // Getter and setters definition for Available
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = disponible;
    }


    @Override
    public String toString() {
        return "MaterialBiblioteca{" +
                "id=" + id +
                ", year=" + year +
                '}';
    }
}
