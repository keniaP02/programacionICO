package PO5_ClasesyObjetos;

public class Nomina {
    private double horasTrabajadas;
    private double pagoPorHora;


    public Nomina(){
        this.horasTrabajadas=0.0;
        this.pagoPorHora=0.0;
    }
    public void establecerhorasTrabajadas(double horas){
        this.horasTrabajadas=horas;
    }
    public double obtenerhorasTrabajadas(){
        return this.horasTrabajadas;
    }
    public void establecerpagoPorHora(double pago){
        this.pagoPorHora=pago;
    }
    public double obtenerpagoPorHora(){
        return this.pagoPorHora;
    }
    public double obtenerSalarioBruto(){
        double salarioBruto=0;
        if(horasTrabajadas <= 40){
            salarioBruto= this.horasTrabajadas * pagoPorHora;
        }
        else{
            double horasExtras=horasTrabajadas - 40;
            salarioBruto= (horasExtras * 1.5*pagoPorHora) + (pagoPorHora* 40);
        }
        return salarioBruto;
    }
}
