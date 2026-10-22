package modelo;

public class Pokemon {

    private String nombre;
    private short puntosDeVida;
    private String tipo;
    private short PS;
    private byte costoretirada;
    // se debe de crear una lista de ataques, entonces toca crear la clase
    private boolean ex;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public short getPuntosDeVida() {
        return puntosDeVida;
    }
    public void setPuntosDeVida(short puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
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
