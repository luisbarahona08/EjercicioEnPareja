import javax.swing.JOptionPane;
import java.time.LocalDate; 

public class PruebaFrecuenciasCardiacas {

    public static void main(String[] args) { 
        // Solicitar nombre y apellido
        String nombre = JOptionPane.showInputDialog(
            "Ingrese su primer nombre:");

        String apellido = JOptionPane.showInputDialog(
            "Ingrese su apellido:");


        // Validar nombre y apellido
        if (nombre == null || nombre.trim().isEmpty() ||
            apellido == null || apellido.trim().isEmpty()) {

            JOptionPane.showMessageDialog(null,
                "Error: el nombre y apellido no pueden estar vacíos.");
            return;
        }


        // Validar que nombre y apellido solo contengan letras
        if (!nombre.matches("[\\p{L} ]+") ||
            !apellido.matches("[\\p{L} ]+")) {

            JOptionPane.showMessageDialog(null,
                "Error: el nombre y apellido solo deben contener letras.");
            return;
        }



        
        // Solicitar fecha de nacimiento
        int dia, mes, anio;

        try {
            dia = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Ingrese su día de nacimiento:"));

            mes = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Ingrese su mes de nacimiento:"));

            anio = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Ingrese su año de nacimiento:"));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Error: debe ingresar números enteros para la fecha.");
            return;
        }
  

        // Validar la fecha de nacimiento
        try {
            LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

            if (fechaNacimiento.isAfter(LocalDate.now())) {
                JOptionPane.showMessageDialog(null,
                    "Error: la fecha de nacimiento no puede ser futura.");
                return;
            }

        } catch (java.time.DateTimeException e) {
            JOptionPane.showMessageDialog(null,
                "Error: la fecha de nacimiento no es válida.");
            return;
        }



        // Crear el objeto con los datos ingresados
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(
            nombre, apellido, dia, mes, anio);

        // Calcular los resultados
        int edad = persona.calcularEdad();
        int frecuenciaMaxima = persona.calcularFrecuenciaMaxima();
        double frecuenciaMinima = persona.calcularFrecuenciaEsperadaMinima();
        double frecuenciaEsperadaMaxima = persona.calcularFrecuenciaEsperadaMaxima();

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null,
            "FRECUENCIAS CARDIACAS\n\n" +
            "Nombre: " + persona.obtenerPrimerNombre() + "\n" +
            "Apellido: " + persona.obtenerApellido() + "\n" +
            "Edad: " + edad + " años\n" +
            "Frecuencia cardiaca maxima: " + frecuenciaMaxima + " ppm\n" +
            "Rango esperado: " + frecuenciaMinima +
            " - " + frecuenciaEsperadaMaxima + " ppm");



    }

}
