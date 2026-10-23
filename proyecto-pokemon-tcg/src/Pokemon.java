import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon extends Carta {

    private TipoEnergia tipo;
    private int psMaximos;
    private int costoRetirada;
    private List<Ataque> ataques;

    public Pokemon(String nombre, TipoEnergia tipo, int psMaximos, int costoRetirada) {
        super(nombre);
        this.tipo = tipo;
        this.psMaximos = psMaximos;
        this.costoRetirada = costoRetirada;
        //this.ataques = new ArrayList<>();
    }
public TipoEnergia getTipo() {
        return tipo;
    }

    public int getPsMaximos() {
        return psMaximos;
    }

    public int getCostoRetirada() {
        return costoRetirada;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    
    }

    public abstract int getPuntosPremio();
}    