public class Mazo {
    private java.util.List<Carta> mazo;

    public Mazo() {
        this.mazo = new java.util.ArrayList<>();
    }

    public void agregar(Carta carta) {
        mazo.add(carta);
    }

    public void barajar() {
        java.util.Collections.shuffle(mazo);
    }

    public Carta robar(Carta carta) {
        mazo.remove(carta);
        return carta;
    }

    public Pokemon buscarBasico() {
        for (int i = 0; i < mazo.size(); i++) {
            if (mazo.get(i) instanceof PokemonBasico) {
                return (PokemonBasico) mazo.get(i);
            }
        }
        return null;
    }

    public void devolverCartas(java.util.List<Carta> cartas) {
        mazo.addAll(cartas);
    }

    public boolean esValido() {
        int cantidadCartas = mazo.size();
        if (cantidadCartas > 20) {
            return false;
        }

        int cantidadPokemons = 0;
        for (int i = 0; i < mazo.size(); i++) {
            if (mazo.get(i) instanceof Pokemon) {
                cantidadPokemons++;
            }
        }
        return cantidadPokemons >= 6;
    }

    public boolean estaVacio() {
        if(mazo.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int cantidadCartas() {
        return mazo.size();
    }
}
