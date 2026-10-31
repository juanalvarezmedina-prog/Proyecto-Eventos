
public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido a POKEMON TCG");
        System.out.println("Jugador 1, ingrese su nombre:");
        String jugador1 = System.console().readLine();
        Partida partida = new Partida(jugador1, null, null);
        partida.iniciar();
        
    }
}