package ejerempleado.interfaz;

import ejerempleado.negocio.Empleado;
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear primer empleado
        System.out.println("--- Datos del Empleado 1 ---");
        System.out.println("Ingrese el primer nombre: ");
        String nom1 = sc.nextLine();
        System.out.println("Ingrese el apellido paterno: ");
        String ape1 = sc.nextLine();
        System.out.println("Ingrese el salario mensual: ");
        double sal1 = Double.parseDouble(sc.nextLine());

        Empleado e1 = new Empleado(nom1, ape1, sal1);

        // Crear segundo empleado
        System.out.println("\n--- Datos del Empleado 2 ---");
        System.out.println("Ingrese el primer nombre: ");
        String nom2 = sc.nextLine();
        System.out.println("Ingrese el apellido paterno: ");
        String ape2 = sc.nextLine();
        System.out.println("Ingrese el salario mensual: ");
        double sal2 = Double.parseDouble(sc.nextLine());

        Empleado e2 = new Empleado(nom2, ape2, sal2);

        // Mostrar salario anual de cada empleado
        System.out.println("\n------------ SALARIOS ANUALES ------------");
        System.out.println(e1);
        System.out.println("------------------------------------------");
        System.out.println(e2);
        System.out.println("------------------------------------------");

        // Aplicar aumento del 10%
        System.out.println("\nAplicando aumento del 10% a cada empleado...\n");
        e1.aplicarAumento(10);
        e2.aplicarAumento(10);

        // Mostrar nuevos salarios anuales
        System.out.println("------- SALARIOS ANUALES CON AUMENTO -------");
        System.out.println(e1);
        System.out.println("------------------------------------------");
        System.out.println(e2);
        System.out.println("------------------------------------------");
    }
}
