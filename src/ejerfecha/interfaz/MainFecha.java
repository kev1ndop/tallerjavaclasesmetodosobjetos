package ejerfecha.interfaz;

import ejerfecha.negocio.Fecha;
import java.util.Scanner;

public class MainFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Registro de Fecha ---");

        System.out.println("Ingrese el mes: ");
        int m = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el dia: ");
        int d = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el anio: ");
        int a = Integer.parseInt(sc.nextLine());

        Fecha f1 = new Fecha(m, d, a);

        System.out.print("\nLa fecha ingresada es: ");
        f1.mostrarFecha();

        // Demostrar metodos establecer
        System.out.println("\nModificando la fecha...");
        f1.establecerMes(12);
        f1.establecerDia(25);
        f1.establecerAnio(2025);

        System.out.print("La fecha modificada es: ");
        f1.mostrarFecha();
    }
}
