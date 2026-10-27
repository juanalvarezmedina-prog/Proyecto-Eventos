
public class App {
    public static void main(String[] args) {
        
        Pokemon pikachu = new PokemonBasico("Pikachu", TipoEnergia.Electrico, 60, 1);
        pikachu.agregarAtaque(new Ataque("Mordisco", TipoEnergia.Electrico, (byte) 1, (short) 20));

        Pokemon squirtle = new PokemonBasico("Squirtle", TipoEnergia.Agua, 60, 1);  
        squirtle.agregarAtaque(new Ataque("Placaje", TipoEnergia.Agua, (byte) 1, (short) 20));

        PokemonEnJuego p1 = new PokemonEnJuego(pikachu);
        PokemonEnJuego p2 = new PokemonEnJuego(squirtle);

        System.out.println(pikachu.getNombre() + " PS: " + p1.getPsActuales());
        System.out.println("Ataques: " + pikachu.getAtaques().size());

        
        Ataque mordisco = pikachu.getAtaques().get(0);
        System.out.println("¿Puede atacar sin energía? " + mordisco.puedeUsarse(p1.getEnergias())); // false
        p1.adjuntarEnergia(TipoEnergia.Electrico);
        System.out.println("¿Puede atacar con energía? " + mordisco.puedeUsarse(p1.getEnergias()));  // true

        
        p2.recibirDano(40);
        System.out.println("Squirtle PS: " + p2.getPsActuales());  // esperado: 20
        p2.curar(20);
        System.out.println("Squirtle curado: " + p2.getPsActuales()); // esperado: 40
    }
}