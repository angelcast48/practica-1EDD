package practica1edd;
public class Jugador {
private String nombre;
private Lista campos=new Lista();
private int Cantidad;
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the campos
     */
    public Lista getCampos() {
        return campos;
    }

    /**
     * @param campos the campos to set
     */
    public void setCampos(Lista campos) {
        this.campos = campos;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

}
