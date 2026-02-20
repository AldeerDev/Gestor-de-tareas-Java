package com.aldeerdev.gestortareas;

import java.time.LocalDate;

public class Tarea {

	private String descripcion;
	private LocalDate fechaCreacion;
	private Boolean completada;

	public Tarea(String descripcion) {
		super();
		this.descripcion = descripcion;
		this.completada = false;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getCompletada() {
		return completada;
	}

	public void setCompletada(Boolean completada) {
		this.completada = completada;
	}

	@Override
	public String toString() {
		return (completada ? "[✓]" : "[ ]") + descripcion;
	}

}
