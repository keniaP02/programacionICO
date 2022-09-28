package PO7_Examen;
import java.util.Scanner;

public class PruebaTemperatura {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        double Ftemp;
        System.out.println("Ingresa una Temperatura en Fahrenheit: ");
        Ftemp=entrada.nextDouble();

        Temperatura Temperatura=new Temperatura(Ftemp);
        System.out.println("La Temperatura en grados Celsius: "+ Ftemp * Temperatura.obtenerCelsius());
        System.out.println("La Temperatura en grados Kelvin: "+ Ftemp * Temperatura.obtenerKelvin());
    }
}
