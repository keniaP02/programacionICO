package PO7_Examen;

public class CLASE_BARCO {
    protected String nombre;
    protected String año;

    //CONSTRUCTOR
    public CLASE_BARCO(String nombre, String año) {
        this.nombre = nombre;
        this.año = año;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getAño() {
        return this.año;
    }

    public String toString() {
        return "Nombre del barco: " + this.nombre + "  Año en que se construyo: " + this.año;
    }
}


