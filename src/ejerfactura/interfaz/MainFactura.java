package ejerfactura.interfaz;

import ejerfactura.negocio.Factura;
import java.util.Scanner;

public class MainFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Registro de Factura ---");

        System.out.println("Ingrese el numero de pieza: ");
        String num = sc.nextLine();

        System.out.println("Ingrese la descripcion de la pieza: ");
        String desc = sc.nextLine();

        System.out.println("Ingrese la cantidad de articulos: ");
        int cant = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el precio por articulo: ");
        double precio = Double.parseDouble(sc.nextLine());

        Factura f1 = new Factura(num, desc, cant, precio);

        System.out.println("\n------------DATOS DE FACTURA------------");
        System.out.println(f1);
        System.out.println("------------------------------------------");

        // Demostrar los metodos establecer
        System.out.println("\nModificando datos de la factura...");
        f1.establecerCantidad(10);
        f1.establecerPrecioPorArticulo(25.50);

        System.out.println("\n------------FACTURA MODIFICADA------------");
        System.out.println(f1);
        System.out.println("------------------------------------------");

        // Demostrar validacion con valores negativos
        System.out.println("\nIntentando establecer cantidad negativa (-5)...");
        f1.establecerCantidad(-5);
        System.out.println("Cantidad resultante: " + f1.obtenerCantidad());

        System.out.println("Intentando establecer precio negativo (-10.0)...");
        f1.establecerPrecioPorArticulo(-10.0);
        System.out.println("Precio resultante: $" + f1.obtenerPrecioPorArticulo());
    }
}
