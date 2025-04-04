package com.gestion_estudiantes;

import java.util.*;

public class GestorEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> estudiantes = new ArrayList<>();

        System.out.println("\n=== GESTOR DE ESTUDIANTE ===");
        
        System.out.print(" Ingrese la cantidad de estudiantes a registrar : ");
        while (!scanner.hasNextInt()) {
            System.err.println(" Error: Debe ingresar un número entero.");
            scanner.next();
            System.out.print(" Ingrese la cantidad de estudiantes: ");
        }
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print(" Nombre del estudiante #" + (i + 1) + ": ");
            while (scanner.hasNextInt()) {
                System.err.println(" Error: ¡Los nombres no pueden ser números");
                scanner.next();
                System.out.print(" Nombre del estudiante #" + (i + 1) + ": ");
            }
            estudiantes.add(scanner.nextLine());
        }

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n=================================");
            System.out.println("  MENÚ PRINCIPAL - GESTOR ");
            System.out.println("=================================");
            System.out.println("");
            System.out.println("1. Mostrar lista completa");
            System.out.println("2. Ordenar alfabéticamente (A-Z)");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print(" Elija una opción : ");

            while (!scanner.hasNextInt()) {
                System.err.println("Error: Opción no válida.");
                scanner.next();
                System.out.print("Elija una opción (1-4) : ");
            }
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nLISTA DE ESTUDIANTES :");
                    estudiantes.forEach(estudiante -> System.out.println("* " + estudiante));
                    break;

                case 2:
                    Collections.sort(estudiantes);
                    System.out.println("\nESTUDIANTES ORDENADOS (A-Z):");
                    estudiantes.forEach(estudiante -> System.out.println("| " + estudiante));
                    break;

                case 3:
                    do {
                        System.out.print("\n Ingrese el nombre a buscar : ");
                        String nombre = scanner.nextLine();
                        if (estudiantes.contains(nombre)) {
                            System.out.println("Encontrado \"" + nombre + "\" está registrado.");
                        } else {
                            System.out.println(" El estudiante \"" + nombre + "\" no existe.");
                        }
                        System.out.print("¿ Buscar otro? (S/N) : ");
                    } while (scanner.nextLine().equalsIgnoreCase("S"));
                    break;

                case 4:
                    System.out.println("\n¡Gracias; vuelva pronto!");
                    break;

                default:
                    System.out.println(" ¡Opción incorrecta! Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}