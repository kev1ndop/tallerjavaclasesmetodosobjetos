package ejerfecha.interfaz;

import ejerfecha.negocio.Fecha;
import java.util.Scanner;

public class MainFecha {
    public static void main(String[] args) {
        int m = 0, d = 0, a = 0, opc = 0;
        Fecha f1 = null;
        Scanner sc = new Scanner(System.in);

        // leer las variables auxiliares
        System.out.print("Ingrese el mes: ");
        m = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el dia: ");
        d = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el anio: ");
        a = Integer.parseInt(sc.nextLine());

        f1 = new Fecha(m, d, a);

        do {
            System.out.println("1.Modificar Mes");
            System.out.println("2.Modificar Dia");
            System.out.println("3.Modificar Anio");
            System.out.println("4.Mostrar Fecha");
            System.out.println("5.Salir");
            System.out.print("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1: {
                    int nMes;
                    System.out.print("Ingrese el nuevo mes: ");
                    nMes = Integer.parseInt(sc.nextLine());
                    f1.establecerMes(nMes);
                    System.out.println("Mes actualizado.");
                    System.out.println("\n------------------------------------------\n");
                } break;
                case 2: {
                    int nDia;
                    System.out.print("Ingrese el nuevo dia: ");
                    nDia = Integer.parseInt(sc.nextLine());
                    f1.establecerDia(nDia);
                    System.out.println("Dia actualizado.");
                    System.out.println("\n------------------------------------------\n");
                } break;
                case 3: {
                    int nAnio;
                    System.out.print("Ingrese el nuevo anio: ");
                    nAnio = Integer.parseInt(sc.nextLine());
                    f1.establecerAnio(nAnio);
                    System.out.println("Anio actualizado.");
                    System.out.println("\n------------------------------------------\n");
                } break;
                case 4: {
                    System.out.println("-------------DATOS DE FECHA-------------\n" + f1);
                    System.out.println("------------------------------------------\n");
                } break;
                case 5: {
                    System.out.println("Gracias por usar nuestros servicios");
                } break;
                default: {
                    System.out.println("Opcion no valida...");
                } break;
            }
        } while (opc != 5);
    }
}
