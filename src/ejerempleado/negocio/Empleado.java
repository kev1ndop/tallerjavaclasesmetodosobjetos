package ejerempleado.negocio;

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;

        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // Metodos establecer y obtener
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    // Metodo para obtener salario anual
    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }

    // Metodo para aplicar aumento porcentual
    public void aplicarAumento(double porcentaje) {
        this.salarioMensual = this.salarioMensual + (this.salarioMensual * porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Empleado: " + primerNombre + " " + apellidoPaterno +
               "\nSalario Mensual: $" + salarioMensual +
               "\nSalario Anual: $" + obtenerSalarioAnual();
    }
}
