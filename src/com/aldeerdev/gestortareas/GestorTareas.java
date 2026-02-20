package com.aldeerdev.gestortareas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

	private static final String ARCHIVO = "tareas.txt";
	private List<Tarea> tareas;
	
	public void guardarEnArchivo() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO));
			for (Tarea tarea : tareas) {
				writer.write(tarea.convertirFormatoArchivo());
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error al guardar tareas: " + e.getMessage());
		}
	}

	public GestorTareas() {
		tareas = new ArrayList<>();
	}

	public void agregarTarea(String descripcion) {
		tareas.add(new Tarea(descripcion));
	}

	public void listarTareas() {
		if (tareas.isEmpty()) {
			System.out.println("No hay tareas.");
		}

		for (int i = 0; i < tareas.size(); i++) {
			System.out.println(i + ". " + tareas.get(i));
		}
	}

	public void completarTarea(int indice) {
		if (indice >= 0 && indice < tareas.size()) {
			tareas.get(indice).setEstado(true);
		} else {
			System.out.println("Indice invalido.");
		}
	}

	public void eliminarTarea(int indice) {
		if (indice >= 0 && indice < tareas.size()) {
			tareas.remove(indice);
		} else {
			System.out.println("Indice invalido.");
		}
	}
}
