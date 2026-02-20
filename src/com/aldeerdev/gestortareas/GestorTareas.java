package com.aldeerdev.gestortareas;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

	private List<Tarea> tareas;

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
			tareas.get(indice).setCompletada(true);
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
