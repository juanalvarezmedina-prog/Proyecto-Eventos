public abstract class Entrenador extends Carta implements Activable {
    private boolean soporte;

    public Entrenador(String nombre, boolean soporte) {
        super(nombre);
        this.soporte = soporte;
    }

    public boolean esSoporte() {
        return soporte;
    }

    // activar(),lo heredan de Activable y cada carta lo implementa
}