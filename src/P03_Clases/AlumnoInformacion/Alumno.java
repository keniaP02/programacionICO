package P03_Clases.AlumnoInformacion;

public class Alumno {
    private String noCuenta;
    private String nombre;
    private String asignatura;
    private double parcial1;
    private double parcial2;
    private String estado;


    public void establecerNoCuenta(String cuentaA){

        this.noCuenta = cuentaA;
    }
    public void establecerNombre(String nombreA){

        this.nombre = nombreA;
    }
    public void establecerAsignatura(String asignaturaA){
        this.asignatura = asignaturaA;
    }
    public void establecerParciales(double p1, double p2){
        this.parcial1 = p1;
        this.parcial2 = p2;
    }

    private double obntenerPromedio(){
        double promedio;
        promedio = (this.parcial1 + this.parcial2)/ 2;
        return promedio;
    }
    private String obtenerEstado(){
        // promedio 8.0 a 10.0 EXENTO
        // promedio 6.0 a 7.9 ORDINARIO
        // promedio 0.0 a 5.09 EXTRAORDINARIO
        // promedio no esta en esos rangos poner INDEFINIDO
        estado = "INDEFINIDO";
        double promedio=obntenerPromedio();
        if (promedio >=8.0 && promedio <=10.0){
            estado="EXENTO";
        }
        else if (promedio >=6.0 && promedio < 8.0){
            estado="ORDINARIO";
        }
        else if (promedio >=0.0 && promedio < 6.0){
            estado="EXTRAORDINARIO";
        }
        return estado;
    }

    public String obtenerDatos(){
        return "tu ceunta es"+this.noCuenta+
                ", te llamas"+this.nombre+
                ", tu asignarura es "+ this.asignatura+
                ",\n tus calificaciones son:"+
                "primer parcia: "+ this.parcial1+
                ", sengundo parcial: "+ this.parcial2+
                "tu promedio es "+ obntenerPromedio()+
                "\nEstas en "+ obtenerEstado();
    }

    public static class PruebaAlumnosCalificaciones {
        public static void main(String[] args) {
            Alumno alumno1 = new Alumno();
            alumno1.establecerNoCuenta("20103601");
            alumno1.establecerNombre("juan perez");
            alumno1.establecerAsignatura("programacion 1");
            alumno1.establecerParciales(10.0,1.5);
            System.out.println(alumno1.obtenerDatos());
        }
    }
}
