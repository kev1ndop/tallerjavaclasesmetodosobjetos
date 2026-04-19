package ejerfrecuencia.interfaz;

import ejerfrecuencia.negocio.FrecuenciasCardiacas;
import java.util.Scanner;

public class MainFrecuencia {
    public static void main(String[] args) {
        String nombre = null, apellido = null;
        int mes = 0, dia = 0, anio = 0, opc = 0;
        FrecuenciasCardiacas persona = null;
        Scanner sc = new Scanner(System.in);

        // leer las variables auxiliares
        System.out.print("Ingrese el primer nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese el mes de nacimiento: ");
        mes = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el dia de nacimiento: ");
        dia = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el anio de nacimiento: ");
        anio = Integer.parseInt(sc.nextLine());

        persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        do {
            System.out.println("1.Mostrar Resultados (Edad y Frecuencia)");
            System.out.println("2.Salir");
            System.out.print("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1: {
                    System.out.println("----------REPORTE DE FRECUENCIA----------\n" + persona);
                    System.out.println("------------------------------------------\n");
                } break;
                case 2: {
                    System.out.println("Gracias por usar nuestros servicios");
                } break;
                default: {
                    System.out.println("Opcion no valida...");
                } break;
            }
        } while (opc != 2);
    }
}
