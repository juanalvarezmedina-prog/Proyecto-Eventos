import modelo.Carta;
import modelo.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Carta carta = new Pokemon("pikachu", "Eléctrico", (short) 60, (byte) 1, false);
        System.out.println("enhorabuena, ya tienes a " + carta.getNombre());
    }
}
