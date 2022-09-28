package DESAFIODEPROGRAMACION_P08;
import java.util.Scanner;

public class SonidoVelocidad{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            menu();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    double distancia;
                    System.out.println("Tiempo en Aire");
                    System.out.print("Ingrese la distancia que recorrera la onda de sonido: ");
                    distancia = entrada.nextDouble();
                    System.out.println("Calculando.......");
                    double A1 = distancia / 1100;
                    System.out.println("El tiempo que se va tardar es de: "+ A1+" Pies por Segundo");
                    break;
                case 2:
                    System.out.println("Tiempo en Agua");
                    System.out.print("Ingrese la distancia que recorrera la onda de sonido: ");
                    distancia = entrada.nextDouble();
                    System.out.println("Calculando.........");
                    double A2 = distancia / 4900;
                    System.out.println("El tiempo que se va tardar es de: "+A2+" Pies por Segundo");
                    break;
                case 3:
                    System.out.println("Tiempo en Acero");
                    System.out.print("Ingrese la distancia que recorrera la onda de sonido: ");
                    distancia = entrada.nextDouble();
                    System.out.println("Calculando.........");
                    double A3= distancia /16400;
                    System.out.println("El tiempo que se va tardar es de: "+A3+" Pies por segundo");
                    break;
                case 4:
                    System.out.println("Saliendo del Programa .........:)");
                default:
                    System.out.println("La opcion que usted selecciono no esta disponible \n por el momento gracias");
            }
        }while (opcion !=4);
    }
    public static  void menu(){
        System.out.println("Programa para calcular la velocidad del sonido atravez de objetos.");
        System.out.println("1. Aire");
        System.out.println("2. Agua");
        System.out.println("3. Acero");
        System.out.println("4. Finalizar el Programa");
        System.out.print("Seleccione alguna opcion: ");
    }
}


