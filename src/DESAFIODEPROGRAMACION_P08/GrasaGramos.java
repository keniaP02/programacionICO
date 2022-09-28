package DESAFIODEPROGRAMACION_P08;
import java.util.Scanner;

public class GrasaGramos{
/*
Programa elaborado por kenia yisel p
 */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            menu();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    double cantidadCalorias, GramosDeGrasa;
                    System.out.print("Ingrese la cantidad de calorias totales: ");
                    cantidadCalorias = entrada.nextDouble();
                    System.out.print("Ingrese la cantidad de gramos de alimento: ");
                    GramosDeGrasa = entrada.nextDouble();
                    double r1 = (GramosDeGrasa * 9);
                    double r2 = (r1/cantidadCalorias)*100;
                    System.out.println("Porcentaje de calorias: "+Math.round(r2)+" %");
                    if(r2 >=0 && r2 <=30){
                        System.out.println("Comida es baja en grasa");
                    }
                    else if(r2 >30){
                        System.out.println("Comida es tiene grasa alta");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion !=2);
    }
    public static void menu(){
        System.out.println("Programa para calcular el porcentaje de calorias grasa");
        System.out.println("1. Iniciar programa");
        System.out.println("2. Finalizar programa");
        System.out.print("Seleccione alguna opcion: ");
    }
}

