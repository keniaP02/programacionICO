package DESAFIODEPROGRAMACION_P08;
import java.util.Scanner;

public class ColoresdelaRuleta {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Ingrese un numero del 0 al 36: ");
        n = entrada.nextInt();
        if(n % 2 == 0){
            System.out.println(n+" Es par");
        }else{
            System.out.println(n+" Es impar");
        }

        System.out.println("Por lo cual corresponde a la casilla");
        if(n>=1 && n<=10){
            if(n % 2 == 0){
                System.out.println("Casilla negra");
            }else {
                System.out.println("Casilla roja");
            }
        }
        else if(n>10 && n<=18){
            if(n % 2 ==0){
                System.out.println("Casilla roja");
            }else{
                System.out.println("Casilla negra");
            }
        }
        else if(n>18 && n<=28){
            if(n % 2 ==0){
                System.out.println("Casilla negra");
            }else {
                System.out.println("Casilla roja");
            }
        }
        else if(n>28 && n<=36){
            if(n % 2 ==0){
                System.out.println("Casilla roja");
            }else{
                System.out.println("Casilla negra");
            }
        }
        else if(n>36) System.out.println("El numero que usted selecciono sobrepasa de los numero pedido");

       }
}


