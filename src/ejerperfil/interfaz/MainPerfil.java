package ejerperfil.interfaz;

import ejerperfil.negocio.PerfilMedico;
import java.util.Scanner;

public class MainPerfil {
    public static void main(String[] args) {
        String nombre = null, apellido = null, sexo = null;
        int dia = 0, mes = 0, anio = 0, opc = 0;
        double altura = 0, peso = 0;
        PerfilMedico paciente = null;
        Scanner sc = new Scanner(System.in);

        // leer las variables auxiliares
        System.out.print("Ingrese el primer nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese el sexo (M/F): ");
        sexo = sc.nextLine();
        System.out.print("Ingrese el dia de nacimiento: ");
        dia = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el mes de nacimiento: ");
        mes = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el anio de nacimiento: ");
        anio = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la altura en centimetros: ");
        altura = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el peso en kilogramos: ");
        peso = Double.parseDouble(sc.nextLine());

        paciente = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        do {
            System.out.println("1.Actualizar Peso");
            System.out.println("2.Actualizar Altura");
            System.out.println("3.Mostrar Reporte Completo y BMI");
            System.out.println("4.Salir");
            System.out.print("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1: {
                    double nPeso;
                    System.out.print("Ingrese el nuevo peso (kg): ");
                    nPeso = Double.parseDouble(sc.nextLine());
                    paciente.establecerPeso(nPeso);
                    System.out.println("Peso actualizado.");
                    System.out.println("\n------------------------------------------\n");
                } break;
                case 2: {
                    double nAltura;
                    System.out.print("Ingrese la nueva altura (cm): ");
                    nAltura = Double.parseDouble(sc.nextLine());
                    paciente.establecerAltura(nAltura);
                    System.out.println("Altura actualizada.");
                    System.out.println("\n------------------------------------------\n");
                } break;
                case 3: {
                    System.out.println("-------------REPORTE MEDICO-------------\n" + paciente);
                    System.out.println("------------------------------------------");
                    System.out.println("             VALORES DE BMI               ");
                    System.out.println("Bajo peso:  menos de 18.5");
                    System.out.println("Normal:     entre 18.5 y 24.9");
                    System.out.println("Sobrepeso:  entre 25 y 29.9");
                    System.out.println("Obeso:      30 o mas");
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
