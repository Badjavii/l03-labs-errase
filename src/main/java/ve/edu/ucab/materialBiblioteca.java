package ve.edu.ucab;

public abstract class materialBiblioteca {
    private Integer id;
    private int anho;
    private String titulo;
    private boolean disponible;

    public abstract void calcularTiempoPrestamo();

    public abstract void generarCodigoCatalogo();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "MaterialBiblioteca{" +
                "id=" + id +
                ", anho=" + anho +
                '}';
    }
}
