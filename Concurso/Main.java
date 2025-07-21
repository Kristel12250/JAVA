package Concurso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Participante> participantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("--- Concurso de Natación ---");
            System.out.println("1. Registrar participante");
            System.out.println("2. Mostrar todos los participantes");
            System.out.println("3. Mostrar participantes aptos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    registrarParticipante();
                    break;
                case 2:
                    mostrarParticipantes(false);
                    break;
                case 3:
                    mostrarParticipantes(true);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void registrarParticipante() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Género: ");
        String genero = scanner.nextLine();

        System.out.print("Condición de salud (buena/mala): ");
        String salud = scanner.nextLine();

        System.out.println("Tipo de entidad:");
        System.out.println("1. Colegio");
        System.out.println("2. Universidad");
        System.out.println("3. Empresa");
        System.out.println("4. Sindicato");
        System.out.print("Seleccione tipo: ");
        int tipoEntidad = scanner.nextInt();
        scanner.nextLine();

        Participante participante = null;

        switch (tipoEntidad) {
            case 1:
                System.out.print("Nombre del colegio: ");
                String colegio = scanner.nextLine();
                participante = new ParticipanteColegio(nombre, edad, genero, salud, colegio);
                break;
            case 2:
                System.out.print("Nombre de la universidad: ");
                String universidad = scanner.nextLine();
                participante = new ParticipanteUniversidad(nombre, edad, genero, salud, universidad);
                break;
            case 3:
                System.out.print("Tipo de empresa (pública/privada): ");
                String tipoEmpresa = scanner.nextLine();
                System.out.print("Nombre de la empresa: ");
                String nombreEmpresa = scanner.nextLine();
                participante = new ParticipanteEmpresa(nombre, edad, genero, salud, tipoEmpresa, nombreEmpresa);
                break;
            case 4:
                System.out.print("Tipo de sindicato: ");
                String sindicato = scanner.nextLine();
                participante = new ParticipanteSindicato(nombre, edad, genero, salud, sindicato);
                break;
            default:
                System.out.println("Opción de entidad inválida.");
                return;
        }

        participantes.add(participante);
        System.out.println("Participante registrado correctamente.");
    }

    private static void mostrarParticipantes(boolean soloAptos) {
        System.out.println("\n--- Lista de participantes ---");
        for (Participante p : participantes) {
            if (!soloAptos || p.puedeParticipar()) {
                System.out.println(p.getInfo());
            }
        }
    }
}
