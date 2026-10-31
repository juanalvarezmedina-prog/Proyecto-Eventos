public class InvestigacionProfesor extends Entrenador {
    public InvestigacionProfesor() {
        super("Investigación del Profesor", true);
    }

    @Override
    public boolean activar(Jugador jugador, Jugador rival) {
    
        jugador.robarCarta();
        jugador.robarCarta();
        return true;
    }
}
