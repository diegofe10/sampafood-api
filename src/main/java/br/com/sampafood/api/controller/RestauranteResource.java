package br.com.sampafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.sampafood.domain.dto.RestauraneDto;
import br.com.sampafood.infrastructure.service.RestauranteService;

@RestController
@RequestMapping("/v1")
public class RestauranteResource {

	@Autowired
	private RestauranteService restauranteService;
	
	@GetMapping("/restaurantes")
	public ResponseEntity<List<RestauraneDto>> list() 
			throws JsonMappingException, JsonProcessingException {
		return ResponseEntity.ok(restauranteService.getAllRestaurantes());
	}
	
}
