package ejerperfil.interfaz;

import ejerperfil.negocio.PerfilMedico;
import java.util.Scanner;

public class MainPerfil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Registro de Perfil Medico ---");

        System.out.println("Ingrese el primer nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Ingrese el sexo (M/F): ");
        String sexo = sc.nextLine();

        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el anio de nacimiento: ");
        int anio = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese la altura en centimetros: ");
        double altura = Double.parseDouble(sc.nextLine());

        System.out.println("Ingrese el peso en kilogramos: ");
        double peso = Double.parseDouble(sc.nextLine());

        PerfilMedico paciente = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        System.out.println("\n------------ REPORTE MEDICO ------------");
        System.out.println(paciente);
        System.out.println("------------------------------------------");

        System.out.println("\n------------- VALORES DE BMI -------------");
        System.out.println("Bajo peso:  menos de 18.5");
        System.out.println("Normal:     entre 18.5 y 24.9");
        System.out.println("Sobrepeso:  entre 25 y 29.9");
        System.out.println("Obeso:      30 o mas");
        System.out.println("------------------------------------------");
    }
}
