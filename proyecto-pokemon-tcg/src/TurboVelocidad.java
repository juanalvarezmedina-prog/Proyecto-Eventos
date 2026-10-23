public class TurboVelocidad extends Entrenador {
    public TurboVelocidad() {
        super("Turbo Velocidad", false);
    }

    @Override
    public boolean activar(Jugador jugador, Jugador rival) {
        PokemonEnJuego activo = jugador.getCampo().getActivo();
        if (activo == null) {
            return false;
        }
        activo.aplicarTurbo();
        return true;
    }
}
