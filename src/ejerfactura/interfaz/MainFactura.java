package ejerfactura.interfaz;

import ejerfactura.negocio.Factura;
import javax.swing.JOptionPane;

public class MainFactura {
    public static void main(String[] args) {
        String num = null, desc = null;
        int cant = 0, opc = 0;
        double precio = 0;
        Factura f1 = null;

        // leer las variables auxiliares con ventanas emergentes
        num   = JOptionPane.showInputDialog(null, "Ingrese el numero de pieza:");
        desc  = JOptionPane.showInputDialog(null, "Ingrese la descripcion de la pieza:");
        cant  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de articulos:"));
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio por articulo:"));

        f1 = new Factura(num, desc, cant, precio);

        do {
            String menu = "1. Modificar Cantidad\n2. Modificar Precio\n3. Mostrar Datos\n4. Salir";
            String opcStr = JOptionPane.showInputDialog(null, menu, "Menu Factura", JOptionPane.PLAIN_MESSAGE);

            if (opcStr == null) break;
            opc = Integer.parseInt(opcStr);

            switch (opc) {
                case 1: {
                    int nuevaCant;
                    nuevaCant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad:"));
                    f1.establecerCantidad(nuevaCant);
                    JOptionPane.showMessageDialog(null, "Cantidad actualizada correctamente.");
                } break;
                case 2: {
                    double nuevoPrecio;
                    nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio:"));
                    f1.establecerPrecioPorArticulo(nuevoPrecio);
                    JOptionPane.showMessageDialog(null, "Precio actualizado correctamente.");
                } break;
                case 3: {
                    JOptionPane.showMessageDialog(null, "--- DATOS DE FACTURA ---\n" + f1,
                            "Datos de Factura", JOptionPane.INFORMATION_MESSAGE);
                } break;
                case 4: {
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios.");
                } break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion no valida.", "Error", JOptionPane.ERROR_MESSAGE);
                } break;
            }
        } while (opc != 4);
    }
}
