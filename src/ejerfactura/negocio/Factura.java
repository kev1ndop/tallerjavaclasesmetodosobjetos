package ejerfactura.negocio;

import java.util.Locale;

public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;

        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }

        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    // Metodos establecer y obtener
    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Metodo que calcula el monto de la factura
    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }

    @Override
    public String toString() {
        return "No. Pieza: " + numeroPieza +
               "\nDescripcion: " + descripcionPieza +
               "\nCantidad: " + cantidad +
               "\nPrecio por articulo: $" + String.format(Locale.US, "%.2f", precioPorArticulo) +
               "\nTotal Factura: $" + String.format(Locale.US, "%.2f", obtenerMontoFactura());
    }
}
