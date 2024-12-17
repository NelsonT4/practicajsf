/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteServices;

/**
 * @author Nelson
 * Clase controller que se encarga de procesar la información para la pantalla restaurante.xhtml
 */
@ManagedBean
@ViewScoped
public class RestauranteController {
	
	private List<Restaurante> restaurante;
	
	private RestauranteServices restauranteServices = new RestauranteServices();
	
	@PostConstruct
	public void init() {
		this.consultarRestaurante();
	}
	
	public void consultarRestaurante() {
		this.restaurante = this.restauranteServices.consultarRestaurante();
	}

	/**
	 * @return the restaurante
	 */
	public List<Restaurante> getRestaurante() {
		return restaurante;
	}
	/**
	 * @param restaurante the restaurante to set
	 */
	public void setRestaurante(List<Restaurante> restaurante) {
		this.restaurante = restaurante;
	}
	
	
	
}
