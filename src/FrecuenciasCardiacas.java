public class FrecuenciasCardiacas {

    private String primerNombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;


    public FrecuenciasCardiacas(String primerNombre, String apellido,
                            int diaNacimiento, int mesNacimiento,
                            int anioNacimiento) {

        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    // Métodos del primer nombre
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    // Métodos del apellido
    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    // Métodos del día de nacimiento
    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    // Métodos del mes de nacimiento
    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    // Métodos del año de nacimiento
    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }


    // Método para calcular la edad
    public int calcularEdad() {
        java.time.LocalDate fechaActual = java.time.LocalDate.now();

        int edad = fechaActual.getYear() - anioNacimiento;

        if (fechaActual.getMonthValue() < mesNacimiento ||
            (fechaActual.getMonthValue() == mesNacimiento &&
             fechaActual.getDayOfMonth() < diaNacimiento)) {
            edad--;
        }

        return edad;
    }


    // Calcular frecuencia cardíaca máxima
    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    // Calcular límite inferior del rango esperado
    public double calcularFrecuenciaEsperadaMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    // Calcular límite superior del rango esperado
    public double calcularFrecuenciaEsperadaMaxima() {
        return calcularFrecuenciaMaxima() * 0.85;
    }




}
