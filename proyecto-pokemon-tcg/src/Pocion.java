public class Pocion extends Entrenador {
    public Pocion() {
        super("Poción", false);
    }

    @Override
    public boolean activar(Jugador jugador, Jugador rival) {
        PokemonEnJuego activo = jugador.getCampo().getActivo();
        if (activo == null) {
            return false;
        }
        activo.curar(20);
        return true;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Efecto: Cura 20 PS al Pokémon Activo de tu lado del campo.");
    }
}