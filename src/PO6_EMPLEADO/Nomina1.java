package PO6_EMPLEADO;

public class Nomina1 {
    private String  nombre;
    private int id;
    public Nomina1 (String nombre1, int idx){
        this.nombre=nombre1;
        this.id=idx;
    }
    public void establecerNombre(String nombre){
        this.nombre=nombre;
    }
    public String obtenernombre(){
        return this.nombre;
    }
    public void establecerid(int id){
        this.id=id;
    }
    public int obtenerid(){
        return this.id;
    }
    public String obtenerDatos(){
        return this.nombre;
        }
    public String obtenerdatos1(){
        return id + "\t";
    }
    private double horastrabajadas;
    private double pagoporhora;

    public Nomina1(){
        this.horastrabajadas=0.0;
        this.pagoporhora=0.0;
    }
    public void establecerhorastrabajadas(double horas){
        this.horastrabajadas=horas;
    }
    public double obtenerhorastrabajadas(){
        return this.horastrabajadas;
    }
    public void establecerpagoporhora(double pago){
        this.pagoporhora=pago;
    }
    public double obtenerpagoporhora(){
        return this.pagoporhora;
    }
    public double obtenersalariobruto() {
        double salariobruto = 0;
        if (horastrabajadas <= 56) {
            salariobruto = this.horastrabajadas * pagoporhora;
        }
        else {
            double horasextas = horastrabajadas - 56;
            salariobruto = (horasextas * 1.5 * pagoporhora) + (pagoporhora * 56);
        }
        return salariobruto;
    }
}
