package PO6_EMPLEADO;

import java.util.Scanner;

public class Nomina1Prueba {
    public static void main (String[] args){
        Nomina1 Trabajador1 = new Nomina1();
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int idx;
        double pagoporhora;
        double horastrabajadas;
        pagoporhora = entrada.nextDouble();
        horastrabajadas = entrada.nextDouble();
        Trabajador1.establecerhorastrabajadas(horastrabajadas);
        Trabajador1.establecerpagoporhora(200);
        System.out.print("Ingresa tu Nombre ");
        nombre= entrada.next();
        System.out.print(" Ingresa tu Numero de Identificacion ");
        idx= entrada.nextInt();
        Nomina1 Empleado= new Nomina1(nombre,idx);
        System.out.print("Nombre: ");
        System.out.println(Empleado.obtenerDatos());
        System.out.print("Numero de Identificacion: ");
        System.out.println(Empleado.obtenerdatos1());
        System.out.println("Horas Trabajadas: "+ Trabajador1.obtenerhorastrabajadas());
        System.out.println("Pago por Hora: "+ Trabajador1.obtenerpagoporhora());
        System.out.println("Salario Bruto: "+ Trabajador1.obtenersalariobruto());
        System.out.println("_______________________________________________");

    }
}
