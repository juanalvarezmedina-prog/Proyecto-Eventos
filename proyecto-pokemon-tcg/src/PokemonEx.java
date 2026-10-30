
public class PokemonEx extends Pokemon {

    public PokemonEx(String nombre, TipoEnergia tipo, int psMaximos, int costoRetirada) {
        super(nombre, tipo, psMaximos, costoRetirada);
    }

    @Override
    public int getPuntosPremio() {
        return 2;
    }
}
