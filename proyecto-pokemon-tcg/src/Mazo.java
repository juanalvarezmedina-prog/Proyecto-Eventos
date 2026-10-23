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
        for (i = 0; i < mazo.size(); i++) {
            if (mazo.get(i) instanceof PokemonBasico) {
                return (PokemonBasico) mazo.get(i);
            }
        }
    }

    public void devolverCartas(java.util.List<Carta> cartas) {
        mazo.addAll(cartas);
    }

    public boolean esValido() {
        byte cantidadCartas = mazo.size();
        if (cantidadCartas > 20) {
            return false;
        }

        byte cantidadPokemons = 0;
        for (i = 0; i < mazo.size(); i++) {
            if (mazo.get(i) instanceof Pokemon) {
                return true;
            }
            else{
                return false;
            }
        }   
    }

    public boolean estaVacio() {
        if(mazo.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public byte cantidadCartas() {
        return mazo.size();
    }
}
