public class PokeBall extends Entrenador {
    public PokeBall() {
        super("Poké Ball", false);
    }

    @Override
    public boolean activar(Jugador jugador, Jugador rival) {
        Pokemon basico = jugador.getMazo().buscarBasico();
        if (basico == null) {
            return false;
        }
        jugador.getMano().add(basico);
        return true;
    }
}