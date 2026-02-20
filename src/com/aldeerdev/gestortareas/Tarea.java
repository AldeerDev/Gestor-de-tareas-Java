package com.aldeerdev.gestortareas;

import java.time.LocalDate;

public class Tarea {

	private String descripcion;
	private LocalDate fechaCreacion;
	private Boolean estado;

	public Tarea(String descripcion) {
		super();
		this.descripcion = descripcion;
		this.fechaCreacion = LocalDate.now();
		this.estado = false;
	}

	// metodo para guardar en archivo
	public String convertirFormatoArchivo() {
		return descripcion + ";" + estado + ":" + fechaCreacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Boolean isEstado() {
		return estado;
	}

	public void setEstado(Boolean completada) {
		this.estado = completada;
	}

	@Override
	public String toString() {
		return (estado ? "[✓] " : "[ ] ") + descripcion + " (Creada: " + fechaCreacion + ")";
	}

}
