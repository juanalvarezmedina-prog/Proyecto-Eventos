public enum TipoEnergia {
    Fuego,
    Agua,
    Electrico,
    Psiquico,
    Incoloro;

    
    public boolean esDebilA(TipoEnergia atacante) {
        switch (this) {
            case Agua:
                return atacante == Fuego || atacante == Electrico;
            case Fuego:
                return atacante == Agua;
            case Incoloro:
                return atacante == Psiquico;
            default:
                return false;
        }
    }
}

