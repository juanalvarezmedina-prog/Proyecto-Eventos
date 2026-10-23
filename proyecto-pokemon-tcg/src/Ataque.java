public class Ataque {
    private String nombre;
    //private TipoEnergia tipoEnergia;
    private Byte costo;
    private Short dano;

    public String getNombre() {
        return nombre;
    }
    public Byte getCosto() {
        return costo;
    }
    public void setCosto(Byte costo) {
        this.costo = costo;
    }
    public Short getDano() {
        return dano;
    }
    public void setDano(Short dano) {
        this.dano = dano;
    }
    //le dejo a camilo el metodo ataque, ya que el es el que lo entiende       
}
