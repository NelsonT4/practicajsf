/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author Nelson
 * Clase que representa la entidad Restaurante
 */
public class Restaurante {
	/**
	 * Nombre del Restaurante
	 */
	private String nombre;
	/**
	 * Dirección del Restaurante
	 */
	private String dirección;
	/**
	 * País de Restaurante
	 */
	private String país;
	/**
	 * Gerente de Restaurante
	 */
	private Gerente gerente;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the dirección
	 */
	public String getDirección() {
		return dirección;
	}
	/**
	 * @param dirección the dirección to set
	 */
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	/**
	 * @return the país
	 */
	public String getPaís() {
		return país;
	}
	/**
	 * @param país the país to set
	 */
	public void setPaís(String país) {
		this.país = país;
	}
	/**
	 * @return the gerente
	 */
	public Gerente getGerente() {
		return gerente;
	}
	/**
	 * @param gerente the gerente to set
	 */
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
}
