import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Campo {
    private static final int MAX_BANCO = 2;

    private PokemonEnJuego activo;
    private List<PokemonEnJuego> banco;

    public Campo() {
        this.activo = null;
        this.banco = new ArrayList<>();
    }

    public PokemonEnJuego getActivo() {
        return activo;
    }

    
    public List<PokemonEnJuego> getBanco() {
        return Collections.unmodifiableList(banco);
    }

    public void setActivo(PokemonEnJuego p) {
        this.activo = p;
    }

    public boolean hayEspacioEnBanco() {
        return banco.size() < MAX_BANCO;
    }

    public boolean colocarEnBanco(PokemonEnJuego p) {
        if (!hayEspacioEnBanco()) {
            return false;
        }
        banco.add(p);
        return true;
    }

    // el del banco pasa a ser el nuevo activo
    public void promoverDelBanco(int indice) {
        validarIndice(indice);
        this.activo = banco.remove(indice);
    }

    // Retirada
    public void intercambiarActivo(int indice) {
        validarIndice(indice);
        PokemonEnJuego nuevoActivo = banco.get(indice);
        banco.set(indice, activo);
        activo = nuevoActivo;
    }

    public void eliminarActivo() {
        this.activo = null;
    }

    public boolean tienePokemonEnJuego() {
        return activo != null || !banco.isEmpty();
    }

    private void validarIndice(int indice) {
        if (indice < 0 || indice >= banco.size()) {
            throw new IllegalArgumentException("Índice de banco inválido: " + indice);
        }
    }
}
