package ejerfrecuencia.negocio;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    // Constructor
    public FrecuenciasCardiacas(String primerNombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    // Metodos establecer y obtener
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    // Metodo que calcula y devuelve la edad en anios
    public int calcularEdad() {
        return 2026 - anioNacimiento;
    }

    // Metodo que calcula y devuelve la frecuencia cardiaca maxima
    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    // Metodo que calcula y devuelve el rango de frecuencia cardiaca esperada
    public String calcularFrecuenciaEsperada() {
        double minimo = calcularFrecuenciaMaxima() * 0.50;
        double maximo = calcularFrecuenciaMaxima() * 0.85;
        return minimo + " - " + maximo + " bpm";
    }

    @Override
    public String toString() {
        return "Nombre: " + primerNombre + " " + apellido +
               "\nFecha de nacimiento: " + mesNacimiento + "/" + diaNacimiento + "/" + anioNacimiento +
               "\nEdad: " + calcularEdad() + " anios" +
               "\nFrecuencia cardiaca maxima: " + calcularFrecuenciaMaxima() + " bpm" +
               "\nRango de frecuencia esperada: " + calcularFrecuenciaEsperada();
    }
}
