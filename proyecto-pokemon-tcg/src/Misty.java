public class Misty extends Entrenador {
    public Misty() {
        super("Misty", true);
    }

    @Override
    public boolean activar(Jugador jugador, Jugador rival) {
        PokemonEnJuego objetivo = buscarPokemonAgua(jugador.getCampo());
        if (objetivo == null) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            objetivo.adjuntarEnergia(TipoEnergia.Agua);
        }
        return true;
    }

    private PokemonEnJuego buscarPokemonAgua(Campo campo) {
        PokemonEnJuego activo = campo.getActivo();
        if (activo != null && activo.getCarta().getTipo() == TipoEnergia.Agua) {
            return activo;
        }
        for (PokemonEnJuego p : campo.getBanco()) {
            if (p.getCarta().getTipo() == TipoEnergia.Agua) {
                return p;
            }
        }
        return null;
    }

    @Override 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Efecto: Adjunta 3 Energías de Agua a un Pokémon de Agua en tu campo.");
    }
}