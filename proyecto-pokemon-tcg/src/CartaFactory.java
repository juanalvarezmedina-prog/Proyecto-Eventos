public class CartaFactory {

    public static Carta crearCarta(String nombre) {
        switch (nombre.toLowerCase()) {
            case "pikachu":
                PokemonBasico p = new PokemonBasico("Pikachu", TipoEnergia.Electrico, 60, 1);
                p.agregarAtaque(new Ataque("Mordisco", TipoEnergia.Electrico, (byte) 1, (short) 20));
                return p;
            case "charmander":
                PokemonBasico c = new PokemonBasico("Charmander", TipoEnergia.Fuego, 60, 1);
                c.agregarAtaque(new Ataque("Ascuas", TipoEnergia.Fuego, (byte) 1, (short) 30));
                return c;
            case "squirtle":
                PokemonBasico s = new PokemonBasico("Squirtle", TipoEnergia.Agua, 60, 1);
                s.agregarAtaque(new Ataque(" Burbujas", TipoEnergia.Agua, (byte) 1, (short) 20));
                return s;
            case "jigglypuff":
                PokemonBasico j = new PokemonBasico("Jigglypuff", TipoEnergia.Incoloro, 70, 1);
                j.agregarAtaque(new Ataque("Canto", TipoEnergia.Incoloro, (byte) 1, (short) 20));
                return j;
            case "magikarp":
                PokemonBasico m = new PokemonBasico("Magikarp", TipoEnergia.Agua, 30, 1);
                m.agregarAtaque(new Ataque("Salto", TipoEnergia.Agua, (byte) 1, (short) 10));
                return m;
            case "snorlax":
                PokemonBasico s2 = new PokemonBasico("Snorlax", TipoEnergia.Incoloro, 150, 4);
                s2.agregarAtaque(new Ataque("Comer", TipoEnergia.Incoloro, (byte) 1, (short) 30));
                return s2;
            case "mewtwo ex":
                PokemonEx m2 = new PokemonEx("Mewtwo EX", TipoEnergia.Psiquico, 150, 1);
                m2.agregarAtaque(new Ataque("Ataque Psíquico", TipoEnergia.Psiquico, (byte) 2, (short) 50));
                m2.agregarAtaque(new Ataque("Psicorrayo", TipoEnergia.Psiquico, (byte) 3, (short) 150));
                return m2;
            case "zapdos ex":
                PokemonEx z = new PokemonEx("Zapdos EX", TipoEnergia.Electrico, 130, 1);
                z.agregarAtaque(new Ataque("Picotazo", TipoEnergia.Electrico, (byte) 1, (short) 30));
                z.agregarAtaque(new Ataque("Tormenta Eléctrica", TipoEnergia.Electrico, (byte) 3, (short) 100));
                return z;
            case "moltres ex":
                PokemonEx m3 = new PokemonEx("Moltres EX", TipoEnergia.Fuego, 130, 2);
                m3.agregarAtaque(new Ataque("Aleteo", TipoEnergia.Fuego, (byte) 1, (short) 30));
                m3.agregarAtaque(new Ataque("Danza Infernal", TipoEnergia.Fuego, (byte) 3, (short) 70));
                return m3;
            case "articuno ex":
                PokemonEx a = new PokemonEx("Articuno EX", TipoEnergia.Agua, 130, 2);
                a.agregarAtaque(new Ataque("Viento Helado", TipoEnergia.Agua, (byte) 1, (short) 30));
                a.agregarAtaque(new Ataque("Ventisca", TipoEnergia.Agua, (byte) 3, (short) 100));
                return a;
            case "investigacion del profesor":
                return new InvestigacionProfesor();
            case "pocion":
                return new Pocion();
            case "pokeball":
                return new PokeBall();
            case "turbo velocidad":
                return new TurboVelocidad();
            case "misty":
                return new Misty();
            default:
                System.out.println("Carta no reconocida: " + nombre);
                return null;
        }
    }
}
