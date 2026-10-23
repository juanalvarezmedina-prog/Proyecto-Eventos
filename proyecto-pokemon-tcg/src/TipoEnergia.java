public enum TipoEnergia {
    FUEGO,
    AGUA,
    ELECTRICO,
    PSIQUICO,
    INCOLORO;

    
    public boolean esDebilA(TipoEnergia atacante) {
        switch (this) {
            case AGUA:
                return atacante == FUEGO || atacante == ELECTRICO;
            case FUEGO:
                return atacante == AGUA;
            case INCOLORO:
                return atacante == PSIQUICO;
            default:
                return false;
        }
    }
}

