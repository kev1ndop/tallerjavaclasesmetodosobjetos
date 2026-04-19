package ejerfrecuencia.interfaz;

import ejerfrecuencia.negocio.FrecuenciasCardiacas;
import java.util.Scanner;

public class MainFrecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculadora de Frecuencia Cardiaca ---");

        System.out.println("Ingrese el primer nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el anio de nacimiento: ");
        int anio = Integer.parseInt(sc.nextLine());

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        System.out.println("\n------------ RESULTADOS ------------");
        System.out.println(persona);
        System.out.println("------------------------------------");
    }
}
