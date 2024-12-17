/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author Nelson
 * Clase que permite realizar la logica de negocio para los restaurantes
 */
public class RestauranteServices {
	/**
	 * Clase que permite consultar los genrentes de los restaurantes
	 * @return {@link Gerente} Lista  de Gerentes
	 */
	public  Gerente consultarGerente(int gerenteEmpresa) {
		
		Gerente gerente = new Gerente();
		
		switch (gerenteEmpresa) {
		case 0: {
			gerente.setNombre("Diego");
			gerente.setPrimerApellido("Paniagua");
			gerente.setSegundoApellido("López");
			break;
		}
		case 1: {
			gerente.setNombre("Erick");
			gerente.setPrimerApellido("Guerrero");
			gerente.setSegundoApellido("Gómez");
			break;
		}
		case 2: {
			gerente.setNombre("Luis Jesus");
			gerente.setPrimerApellido("López");
			gerente.setSegundoApellido("Romero");
			break;
		}
		case 3: {
			gerente.setNombre("Gerardo");
			gerente.setPrimerApellido("Guerrero");
			gerente.setSegundoApellido("Gómez");
			break;
		}
		case 4: {
			gerente.setNombre("Daniel");
			gerente.setPrimerApellido("López");
			gerente.setSegundoApellido("Romero");
			break;
		}
		
		default:
			gerente.setNombre("NN");
			gerente.setPrimerApellido("");
			gerente.setSegundoApellido("");
		}
		
		
		return gerente;
		
	}
	
	/**
	 * Clase que permite consultar los restaurantes
	 * @return {@link Restaurante} Lista restaurante
	 */
	public List<Restaurante> consultarRestaurante(){	
		/**
		 * Generar lista de restaurantes a conultar
		 */
		List<Restaurante> restaurante = new ArrayList<Restaurante>();
		
		Restaurante restauranteMacDonalds = new Restaurante();
		Restaurante restaurantelaVidaArgentina = new Restaurante();
		Restaurante restaurantelaChilaca = new Restaurante();
		Restaurante restauranteCienega = new Restaurante();
		Restaurante restauranteSocarrat = new Restaurante();
		
		restauranteMacDonalds.setNombre("MacDonalds");
		restauranteMacDonalds.setDirección("Dirección 1");
		restauranteMacDonalds.setPaís("Estados Unidos");
		restauranteMacDonalds.setGerente(consultarGerente(0));
		
		restaurantelaVidaArgentina.setNombre("La Vid Argentina");
		restaurantelaVidaArgentina.setDirección("Dirección 2");
		restaurantelaVidaArgentina.setPaís("Argentina");
		restaurantelaVidaArgentina.setGerente(consultarGerente(1));
		
		restaurantelaChilaca.setNombre("La  Chulaca");
		restaurantelaChilaca.setDirección("Dirección 3");
		restaurantelaChilaca.setPaís("Chile");
		restaurantelaChilaca.setGerente(consultarGerente(2));
		
		restauranteCienega.setNombre("Cienaga");
		restauranteCienega.setDirección("Dirección 4");
		restauranteCienega.setPaís("Colombia");
		restauranteCienega.setGerente(consultarGerente(3));
		
		restauranteSocarrat.setNombre("Socarrat");
		restauranteSocarrat.setDirección("Dirección 5");
		restauranteSocarrat.setPaís("España");
		restauranteSocarrat.setGerente(consultarGerente(4));
		
		restaurante.add(restauranteMacDonalds);
		restaurante.add(restaurantelaVidaArgentina);
		restaurante.add(restaurantelaChilaca);
		restaurante.add(restauranteCienega);
		restaurante.add(restauranteSocarrat);
		
		return restaurante;
		
	}
}
