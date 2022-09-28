package PO7_Examen;

public class BARCOCARGA {  extends CLASE BARCO {
    private int tonelaje;

    //CONSTRUCTOR
    public BARCOCARGA(String nombre, String año, int tonelaje) {
        super(nombre, año);
        this.tonelaje = tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public int getTonelaje() {
        return this.tonelaje;
    }

    public String toString() {
        return "Nombre del barco: " + this.nombre + "      Maximo de tonejale:  " + this.tonelaje;
    }
}

}
