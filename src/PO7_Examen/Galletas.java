package PO7_Examen;


import java.util.Scanner;

public class Galletas {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double numerodegalletasconsumidas, caloriasporgalletas, caloriasconsumidas;
        System.out.println("Calorias totales consumidas ");
        System.out.println("Dame el numero de galletas consumidas:  ");
        numerodegalletasconsumidas= entrada.nextDouble();
        System.out.println("Dame la cantidad de calorias por galletas:  ");
        caloriasporgalletas= entrada.nextDouble();
        caloriasconsumidas= numerodegalletasconsumidas * caloriasporgalletas;
                System.out.println("Total de calorias consumidas:  ");


    }
}
