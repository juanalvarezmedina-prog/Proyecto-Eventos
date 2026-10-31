import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido a POKEMON TCG");
        System.out.println("Jugador 1, ingrese su nombre:");
        String jugador1 = System.console().readLine();
        System.out.println("Qué desea hacer?");
        System.out.println("1. mazo predefinido");
        System.out.println("2. crear mazo personalizado");

        int opcion = Integer.parseInt(System.console().readLine());

        if (opcion == 1) {
            System.out.println("1. Mazo de fuego");
            System.out.println("2. Mazo de agua");
            System.out.println("3. Mazo de eléctrico");

            int opcionMazo = Integer.parseInt(System.console().readLine());

            switch (opcionMazo) {
                case 1:
                    System.out.println("Mazo de fuego seleccionado");
                    break;
                case 2:
                    System.out.println("Mazo de agua seleccionado");
                    break;
                case 3:
                    System.out.println("Mazo de eléctrico seleccionado");
                    break;
                default:
                    System.out.println("Opción inválida, se seleccionará el mazo de fuego");
            }
        } else if (opcion == 2) {
            System.out.println("Mazo personalizado seleccionado");
            System.out.println(jugador1 + ", elija sus cartas:");

           List<String> nombres = CartaFactory.nombresDisponibles();
            for (int i = 0; i < nombres.size(); i++) {
                Carta c = CartaFactory.crearCarta(nombres.get(i));
                 System.out.println((i + 1) + ". " + /* info de c */);
}
        } else {
                System.out.println("Opción inválida, se seleccionará el mazo predefinido");
        }

        
        
        Jugador player1 = new Jugador(jugador1, null, null  );
        System.out.println("Jugador 2, ingrese su nombre:");
        String jugador2 = System.console().readLine();
        System.out.println(jugador2 + ", elija sus cartas:");
        Jugador player2 = new Jugador(jugador2, null, null);
        Partida partida = new Partida(player1, player2, null);
        partida.iniciar();
        
    }
}