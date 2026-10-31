
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

            ////////////////
            System.out.println("Pikachu // Tipo: Eléctrico // PS: 60 // ataque1 = Mordisco(1 ⚡) 20 daño // Costo de retirada: 1 ☆");
            System.out.println("Charmander // Tipo: Fuego // PS: 60 // ataque1 = Ascuas(1 🔥) 30 daño // Costo de retirada: 1 ☆");
            System.out.println("Squirtle // Tipo: Agua // PS: 60 // ataque1 = Placaje(1 💧) 20 daño // Costo de retirada: 1 ☆");
            System.out.println("Jigglypuff // Tipo: Incoloro // PS: 70 // ataque1 = Golpe(1 ☆) 20 daño // Costo de retirada: 1 ☆");
            System.out.println("Magikarp // Tipo: Agua // PS: 30 // ataque1 = Chapoteo(1 💧) 10 daño // Costo de retirada: 1 ☆");
            System.out.println("Snorlax // Tipo: Incoloro // PS: 150 // ataque1 = Golpe Cuerpo(3 ☆) 100 daño // Costo de retirada: 4 ☆");
            System.out.println("Mewtwo EX // Tipo: Psiquico // PS: 150 // ataque1 = Ataque Psiquico(2 🔮) 50 daño // ataque2 = Psicorrayo(3 🔮) 150 daño // Costo de retirada: 2 ☆");
            System.out.println("Zapdos EX // Tipo: Eléctrico // PS: 130 // ataque1 = Picotazo(1 ☆) 30 daño // ataque2 = Tormenta Eléctrica(3 ⚡) 100 daño // Costo de retirada: 1 ☆");
            System.out.println("Moltres EX // Tipo: Fuego // PS: 130 // ataque1 = Aleteo(1 ☆) 30 daño // ataque2 = Danza Infernal(3 🔥) 70 daño // Costo de retirada: 2 ☆");
            System.out.println("Articuno EX // Tipo: Agua  // PS: 130 // ataque1 = Viento Helado(1 💧) 30 daño // ataque2 = Ventisca(3 💧) 100 daño // Costo de retirada: 2 ☆");
            ////////////////
            ///
            System.out.println("Investigacion del Profesor // Tipo: Soporte // Efecto: Roba 2 cartas");
            System.out.println("Pocion // Tipo: Objeto // Efecto: Cura 20 PS al Pokémon Activo");
            System.out.println("Pokeball // Tipo: Objeto // Efecto: Busca un pokemon básico en el mazo y lo pone en la mano");
            System.out.println("Turbo Velocidad // Tipo: Objeto // Efecto: Reduce en 1 el costo de retirada del Pokémon Activo hasta el final del turno");
            System.out.println("Misty // Tipo: Soporte // Efecto: Adjunta 1 a 3 energias de agua a uno de tus pokeon del tipo agua de manera aleatoria");
            ////////////////
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