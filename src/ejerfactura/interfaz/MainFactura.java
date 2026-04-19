package ejerfactura.interfaz;

import ejerfactura.negocio.Factura;
import java.util.Scanner;

public class MainFactura {
    public static void main(String[] args) {
        String num = null, desc = null;
        int cant = 0, opc = 0;
        double precio = 0;
        Factura f1 = null;
        Scanner sc = new Scanner(System.in);

        // leer las variables auxiliares
        System.out.println("Ingrese el numero de pieza: ");
        num = sc.nextLine();
        System.out.println("Ingrese la descripcion de la pieza: ");
        desc = sc.nextLine();
        System.out.println("Ingrese la cantidad de articulos: ");
        cant = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el precio por articulo: ");
        precio = Double.parseDouble(sc.nextLine());

        f1 = new Factura(num, desc, cant, precio);

        do {
            System.out.println("1.Modificar Cantidad");
            System.out.println("2.Modificar Precio");
            System.out.println("3.Mostrar Datos");
            System.out.println("4.Salir");
            System.out.print("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1: {
                    int nuevaCant;
                    System.out.print("Ingrese la nueva cantidad: ");
                    nuevaCant = Integer.parseInt(sc.nextLine());
                    f1.establecerCantidad(nuevaCant);
                    System.out.println("Cantidad actualizada.");
                    System.out.println("\n------------------------------------------\n");
                } break;
                case 2: {
                    double nuevoPrecio;
                    System.out.print("Ingrese el nuevo precio: ");
                    nuevoPrecio = Double.parseDouble(sc.nextLine());
                    f1.establecerPrecioPorArticulo(nuevoPrecio);
                    System.out.println("Precio actualizado.");
                    System.out.println("\n------------------------------------------\n");
                } break;
                case 3: {
                    System.out.println("------------DATOS DE FACTURA------------\n" + f1);
                    System.out.println("------------------------------------------\n");
                } break;
                case 4: {
                    System.out.println("Gracias por usar nuestros servicios");
                } break;
                default: {
                    System.out.println("Opcion no valida...");
                } break;
            }
        } while (opc != 4);
    }
}
