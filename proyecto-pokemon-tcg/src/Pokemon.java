import java.util.ArrayList;
import java.util.Collections;
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
        this.ataques = new ArrayList<>(); 
    }

    // 3. getter y forma de agregar ataques
    public List<Ataque> getAtaques() {
        return Collections.unmodifiableList(ataques);
    }

    protected void agregarAtaque(Ataque ataque) {
        ataques.add(ataque);
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

    public abstract int getPuntosPremio();
}
