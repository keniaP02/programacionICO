package Examen02;

import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {


        Scanner scaner = new Scanner (System.in);
        System.out.println ("Seleccionar una opcion: [1,2,3]");
        System.out.println ("1- calcular velocidad en aire");
        System.out.println ("2- calcular velocidad en agua");
        System.out.println ("3- calcular velocidad en acero");
        int opc = scaner.nextInt();

        System.out.println ("Ingresa la distancia");
        int distancia = scaner.nextInt();

        switch(opc){
            case 1:
                calcularVelocidadAire(distancia);
                break;
            case 2:
                calcularVelocidadAgua(distancia);
                break;
            case 3:
                calcularVelocidadAcero(distancia);
                break;
            default:
                System.out.println("opcion invalida");

        }
    }

    public static void calcularVelocidadAire(int distancia){
        System.out.println((distancia / 1100));
    }

    public static void calcularVelocidadAgua(int distancia){
        System.out.println((distancia / 4900));
    }

    public static void calcularVelocidadAcero(int distancia){
        System.out.println((distancia / 16400));
    }

}
