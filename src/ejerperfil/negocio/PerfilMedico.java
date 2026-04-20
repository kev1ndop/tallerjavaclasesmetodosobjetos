package ejerperfil.negocio;

import java.time.LocalDate;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura; // en centimetros
    private double peso;   // en kilogramos

    // Constructor
    public PerfilMedico(String primerNombre, String apellido, String sexo,
                        int diaNacimiento, int mesNacimiento, int anioNacimiento,
                        double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
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

    public void establecerSexo(String sexo) {
        this.sexo = sexo;
    }

    public String obtenerSexo() {
        return sexo;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }

    public double obtenerAltura() {
        return altura;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    public double obtenerPeso() {
        return peso;
    }

    // Metodo que calcula y devuelve la edad en anios
    public int calcularEdad() {
        return LocalDate.now().getYear() - anioNacimiento;
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

    // Metodo que calcula y devuelve el indice de masa corporal (BMI)
    public double calcularBMI() {
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }

    public String obtenerClasificacionBMI() {
        double bmi = calcularBMI();

        if (bmi < 18.5) {
            return "Bajo peso";
        }
        if (bmi < 25.0) {
            return "Normal";
        }
        if (bmi < 30.0) {
            return "Sobrepeso";
        }
        return "Obeso";
    }

    @Override
    public String toString() {
        return "Nombre: " + primerNombre + " " + apellido +
               "\nSexo: " + sexo +
               "\nFecha de nacimiento: " + mesNacimiento + "/" + diaNacimiento + "/" + anioNacimiento +
               "\nAltura: " + altura + " cm" +
               "\nPeso: " + peso + " kg" +
               "\nEdad: " + calcularEdad() + " anios" +
               "\nIMC (BMI): " + String.format("%.2f", calcularBMI()) +
               "\nClasificacion BMI: " + obtenerClasificacionBMI() +
               "\nFrecuencia cardiaca maxima: " + calcularFrecuenciaMaxima() + " bpm" +
               "\nRango de frecuencia esperada: " + calcularFrecuenciaEsperada();
    }
}
