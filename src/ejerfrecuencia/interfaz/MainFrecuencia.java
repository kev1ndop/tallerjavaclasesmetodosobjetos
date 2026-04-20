package ejerfrecuencia.interfaz;

import ejerfrecuencia.negocio.FrecuenciasCardiacas;
import javax.swing.JOptionPane;

public class MainFrecuencia {
    public static void main(String[] args) {
        String nombre = null, apellido = null;
        int mes = 0, dia = 0, anio = 0, opc = 0;
        FrecuenciasCardiacas persona = null;

        // leer las variables auxiliares con ventanas emergentes
        nombre  = JOptionPane.showInputDialog(null, "Ingrese el primer nombre:");
        apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido:");
        mes  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes de nacimiento:"));
        dia  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia de nacimiento:"));
        anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el anio de nacimiento:"));

        persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        do {
            String menu = "1. Mostrar Resultados (Edad y Frecuencia)\n2. Salir";
            String opcStr = JOptionPane.showInputDialog(null, menu, "Menu Frecuencias Cardiacas", JOptionPane.PLAIN_MESSAGE);

            if (opcStr == null) break;
            opc = Integer.parseInt(opcStr);

            switch (opc) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "--- REPORTE DE FRECUENCIA ---\n" + persona,
                            "Reporte de Frecuencia Cardiaca", JOptionPane.INFORMATION_MESSAGE);
                } break;
                case 2: {
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios.");
                } break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion no valida.", "Error", JOptionPane.ERROR_MESSAGE);
                } break;
            }
        } while (opc != 2);
    }
}
