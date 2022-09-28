package PO7_Examen;

import java.util.Scanner;

public class Galleta_01 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        int GalletasIng;
        int CaloriasPorGalleta = 300;
        int CaloriasIng;
        System.out.println("Ingresa el numero de galletas ingeridas: ");
        GalletasIng = entrada.nextInt();
        CaloriasIng = GalletasIng * CaloriasPorGalleta;
        System.out.println("Las calorias ingeridas son: " + CaloriasIng);
    }
}

