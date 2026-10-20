package modelo;
public class CartaEntrenador extends Carta {

    private String descripcion;
    private String rareza;
    private String ilustracion;

    public CartaEntrenador(String nombre, String descripcion, String rareza, String ilustracion) {
        super(nombre);
        this.descripcion = descripcion;
        this.rareza = rareza;
        this.ilustracion = ilustracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public String getIlustracion() {
        return ilustracion;
    }

    public void setIlustracion(String ilustracion) {
        this.ilustracion = ilustracion;
    }
    

}
