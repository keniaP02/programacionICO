package P04_Clases.PromedioNombre;
// Fig. 4.4: Estudiante.java
// Clase Estudiante que almacena el nombre y promedio de un estudiante.

public class Estudiante {


        private String nombre;
        private double promedio;

        // el constructor inicializa las variables de instancia.
        public Estudiante(String nombre, double promedio) {
            this.nombre = nombre;

            // valida que promedio sea > 0.0 y <= 100.0; de lo contrario.
            // mantiene el valor predeterminado de variable de istancia promedio (0.0)
            if (promedio > 0.0)
                if (promedio <= 100.0)
                    this.promedio = promedio; // asigna ala variable de instancia
        }

    // establese el nombre del estudiante
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre;
    }

    // recupera el nombre del estudiante
    public String obtenerNombre()
    {
        return nombre;
    }

    // establese el promedio del Estudiante
    public void establecerPromedio(double promedio)
    {
        // valida que promedio sea > 0.0 y <= 100.0; de lo contario
        // mantiene el valor actual de la variable de instancia promedio
        if (promedio > 0.0)
            if (promedio <= 100.0)
                this.promedio = promedio; // asigna ala variable de instancia
    }

    // recupera el promedio del Estudiante
    public double obtenerPromedio()
    {
        return promedio;
    }

    // determina y devuelve la calificación en letras del  Estudiante
    public String obtenerCalificacionEstudiante()
    {
        String calificacionEstudiante = ""; // se inicializa con objeto String vacio

        if (promedio >= 90.0)
            calificacionEstudiante = "A";
        else if (promedio >= 80.0)
            calificacionEstudiante = "B";
        else if (promedio >= 70.0)
            calificacionEstudiante = "c";
        else if (promedio >= 60.0)
            calificacionEstudiante = "D";
        else
            calificacionEstudiante = "F";

        return calificacionEstudiante;
    }
}// fin de la clase Estudiante


