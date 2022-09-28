package Examen02;

import java.util.Scanner;

public class ProvedordeServiciosMoviles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    double minutos;
                    System.out.println("Usted selecciono el paquete 1");
                    System.out.print("Ingrese la cantidad de minutos utilizados: ");
                    minutos = entrada.nextDouble();
                    double h1= 40.00;
                    if(minutos <= 400){
                        System.out.println("El cargo total es de: $ "+h1);
                    }
                    else if(minutos>400){
                        double r1= minutos - 400;
                        double r2= r1* 0.55;
                        double r3= h1+r2;
                        System.out.println("El precio de paquete es de: "+h1);
                        System.out.println("Pero utilizo: "+r1+" minutos adicionales");
                        System.out.println("El cargo total es de: $ "+Math.round(r3));
                    } break; case 2:
                    System.out.println("Usted selecciono el paquete 2");
                    System.out.print("Ingresa la cantidad de minutos utilizados: ");
                    minutos = entrada.nextDouble();
                    double h2= 60.00;
                    if(minutos<=900){
                        System.out.println("El cargo total es de: $ "+h2);
                    }
                    else if(minutos>900){
                        double r1= minutos - 900;
                        double r2= r1* 0.45;
                        double r3= h2+r2;
                        System.out.println("El precio de paquete es de: "+h2);
                        System.out.println("Pero utilizó: "+r1+" minutos adicionales");
                        System.out.println("El cargo total es de: $ "+r3);
                    }
                    break;
                case 3:
                    System.out.println("Usted seleccionó el paquete 3");
                    System.out.print("Ingrese la cantidad de minutos utilizados: ");
                    minutos = entrada.nextDouble();
                    double h3= 70.00;
                    if (minutos>=0){
                        System.out.println("Dado a que el paquete C cuenta con minutos ilimitados \n el cargo total no cambia");
                        System.out.println("Cargo total: $ "+h3);
                    }

            }
        }while(opcion !=4);
    }
    public static void menu(){
        System.out.println("Proveedor de servicios moviles.");
        System.out.println("------------------------------------");
        System.out.println("Paquete 1");
        System.out.println("Paquete 2");
        System.out.println("Paquete 3");
        System.out.println("------------------------------------");
        System.out.print("Seleccione el paquete que contrató: ");
    }
}
