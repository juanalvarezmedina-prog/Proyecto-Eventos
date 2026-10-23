
public class PokemonEx extends Pokemon {
    private int psActuales;

    public PokemonEx(String nombre, TipoEnergia tipo, int psMaximos, int costoRetirada) {
        super(nombre, tipo, psMaximos, costoRetirada);
        this.psActuales = psMaximos;
    }


    public int getPuntosPremio() {
        return 2;
    }

    
}
