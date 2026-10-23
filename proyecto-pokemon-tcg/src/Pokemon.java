public abstract class Pokemon extends Carta {

    private TipoEnergia tipo;
    private int psMaximos;
    private int costoRetirada;

    public Pokemon(String nombre, TipoEnergia tipo, int psMaximos, int costoRetirada) {
        super(nombre);
        this.tipo = tipo;
        this.psMaximos = psMaximos;
        this.costoRetirada = costoRetirada;
    }

    public TipoEnergia getTipo() {
        return tipo;
    }

    public int getPsMaximos() {
        return psMaximos;
    }

    public int getCostoRetirada() {
        return costoRetirada;
    }

    public abstract int getPuntosPremio();
}    