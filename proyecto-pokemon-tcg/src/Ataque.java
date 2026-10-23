import java.util.List;

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
    public boolean puedeUsarse(List<TipoEnergia> adjuntas) {
        byte contador = 0;
        for (TipoEnergia energia : adjuntas) {
            if (energia == TipoEnergia.FUEGO) {
                contador++;
            }
        }
        if (contador >= costo) {
            return true;
        }
        return false;
    }
}
