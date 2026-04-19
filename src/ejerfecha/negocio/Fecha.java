package ejerfecha.negocio;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    // Constructor
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // Metodos establecer y obtener
    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerAnio(int anio) {
        this.anio = anio;
    }

    public int obtenerAnio() {
        return anio;
    }

    // Metodo que muestra la fecha con formato mes/dia/anio
    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + anio);
    }

    @Override
    public String toString() {
        return mes + "/" + dia + "/" + anio;
    }
}
