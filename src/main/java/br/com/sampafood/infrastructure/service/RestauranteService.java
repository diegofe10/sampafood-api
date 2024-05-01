package br.com.sampafood.infrastructure.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.sampafood.domain.dto.RestauraneDto;
import br.com.sampafood.domain.utils.Utils;

@Service
public class RestauranteService {

	public List<RestauraneDto> getAllRestaurantes() throws JsonMappingException, JsonProcessingException {
		String json = Utils.getResource("mock/restaurantes/restaurantes.json");
		
		ObjectMapper mapper = new ObjectMapper();
		List<RestauraneDto> restauraneDto = mapper.readValue(json, new TypeReference<List<RestauraneDto>>(){});
	
		return restauraneDto;
	}
	
	
}
