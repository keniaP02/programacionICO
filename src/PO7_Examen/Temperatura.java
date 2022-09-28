package PO7_Examen;

public class Temperatura {
    private double Ftemp;

    public Temperatura( double ftempk){
        this.Ftemp=ftempk;
    }
    public void establecerFahrenheit(double Ftemp){
        this.Ftemp=Ftemp;
    }
    public double obtenerFahrenheit(double ftemp){
       return this.Ftemp=Ftemp;
    }
    public double obtenerCelsius(){
        return (9/5.0)* (Ftemp+32);
    }
    public int obtenerKelvin(){
        return (int) ((5/9) * (Ftemp-32) + 273);
    }



}
