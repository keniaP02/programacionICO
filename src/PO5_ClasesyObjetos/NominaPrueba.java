package PO5_ClasesyObjetos;

public class NominaPrueba {
    public static void main (String[] args){
        //Trabajador 1
        Nomina trabajador1= new Nomina();
        trabajador1.establecerhorasTrabajadas(30);
        trabajador1.establecerpagoPorHora(200);
        System.out.println("Primer Trabajador: ");
        System.out.println("Horas Trabajadas:"+ trabajador1.obtenerhorasTrabajadas());
        System.out.println("Pago por Hora: "+ trabajador1.obtenerpagoPorHora());
        System.out.println("Salario Bruto: "+ trabajador1.obtenerSalarioBruto());
        System.out.println("____________________________________________________");
        //Trabajador 2
        Nomina trabajador2= new Nomina();
        trabajador2.establecerhorasTrabajadas(45);
        trabajador2.establecerpagoPorHora(200);
        System.out.println("Segundo Trabajador: ");
        System.out.println("Horas Trabajadas:"+ trabajador2.obtenerhorasTrabajadas());
        System.out.println("Pago por Hora: "+ trabajador2.obtenerpagoPorHora());
        System.out.println("Salario Bruto: "+ trabajador2.obtenerSalarioBruto());
    }
}
