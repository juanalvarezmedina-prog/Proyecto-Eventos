public class Pokemon extends Carta {

    private String tipo;
    private short PS;
    private byte costoretirada;
    // se debe de crear una lista de ataques, entonces toca crear la clase
    private boolean ex;

    public Pokemon(String nombre, String tipo, short pS, byte costoretirada, boolean ex) {
        super(nombre);
        
        this.tipo = tipo;
        PS = pS;
        this.costoretirada = costoretirada;
        this.ex = ex;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public short getPS() {
        return PS;
    }
    public void setPS(short pS) {
        PS = pS;
    }
    public byte getCostoretirada() {
        return costoretirada;
    }
    public void setCostoretirada(byte costoretirada) {
        this.costoretirada = costoretirada;
    }
    public boolean isEx() {
        return ex;
    }
    public void setEx(boolean ex) {
        this.ex = ex;
    }
    

}