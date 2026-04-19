package ejerempleado.interfaz;

import ejerempleado.negocio.Empleado;
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        String nom1 = null, ape1 = null, nom2 = null, ape2 = null;
        double sal1 = 0, sal2 = 0;
        int opc = 0;
        Empleado e1 = null, e2 = null;
        Scanner sc = new Scanner(System.in);

        // leer las variables auxiliares
        System.out.println("--- Datos Empleado 1 ---");
        System.out.print("Ingrese el primer nombre: ");
        nom1 = sc.nextLine();
        System.out.print("Ingrese el apellido paterno: ");
        ape1 = sc.nextLine();
        System.out.print("Ingrese el salario mensual: ");
        sal1 = Double.parseDouble(sc.nextLine());

        System.out.println("--- Datos Empleado 2 ---");
        System.out.print("Ingrese el primer nombre: ");
        nom2 = sc.nextLine();
        System.out.print("Ingrese el apellido paterno: ");
        ape2 = sc.nextLine();
        System.out.print("Ingrese el salario mensual: ");
        sal2 = Double.parseDouble(sc.nextLine());

        e1 = new Empleado(nom1, ape1, sal1);
        e2 = new Empleado(nom2, ape2, sal2);

        do {
            System.out.println("1.Aplicar 10% de Aumento a ambos");
            System.out.println("2.Mostrar Datos y Salarios Anuales");
            System.out.println("3.Salir");
            System.out.print("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1: {
                    e1.aplicarAumento(10);
                    e2.aplicarAumento(10);
                    System.out.println("Aumento del 10% aplicado correctamente a ambos empleados.");
                    System.out.println("\n------------------------------------------\n");
                } break;
                case 2: {
                    System.out.println("-----------DATOS EMPLEADO 1-----------\n" + e1);
                    System.out.println("-----------DATOS EMPLEADO 2-----------\n" + e2);
                    System.out.println("------------------------------------------\n");
                } break;
                case 3: {
                    System.out.println("Gracias por usar nuestros servicios");
                } break;
                default: {
                    System.out.println("Opcion no valida...");
                } break;
            }
        } while (opc != 3);
    }
}
