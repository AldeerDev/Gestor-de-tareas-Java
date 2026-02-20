package com.aldeerdev.gestortareas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestorTareas gestor = new GestorTareas();

		int opcion;

		do {
			System.out.println("\n--- GESTOR DE TAREAS ---");
			System.out.println("1. Agregar tarea");
			System.out.println("2. Listar tareas");
			System.out.println("3. Completar Tarea");
			System.out.println("4. Eliminar tarea");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opcion: ");

			opcion = sc.nextInt();
			sc.nextLine(); // limpiar el buffer

			switch (opcion) {
			case 1: {
				System.out.print("Ingrese descripcion: ");
				String descripcion = sc.nextLine();
				gestor.agregarTarea(descripcion);
				break;
			}
			case 2: {
				System.out.println("Lista de tareas");
				gestor.listarTareas();
				break;
			}
			case 3: {
				System.out.print("Ingrese indice de tarea: ");
				int indice = sc.nextInt();
				gestor.completarTarea(indice);
				break;
			}
			case 4: {
				System.out.print("Ingrese indice de tarea: ");
				int indice = sc.nextInt();
				gestor.eliminarTarea(indice);
				break;
			}
			case 0: {
				System.out.println("Saliendo...");
			}
			default:
				System.out.println("Opcion invalida.");
			}
		} while (opcion != 0);

		sc.close();
	}

}
