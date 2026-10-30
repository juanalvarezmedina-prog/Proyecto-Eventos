public class PokemonBasico extends Pokemon {

    public PokemonBasico(String nombre, TipoEnergia tipo, int psMaximos, int costoRetirada) {
        super(nombre, tipo, psMaximos, costoRetirada);
    }

    @Override
    public int getPuntosPremio() {
        return 1;
    }
}