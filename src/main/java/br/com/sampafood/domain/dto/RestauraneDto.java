package br.com.sampafood.domain.dto;

public record RestauraneDto(
		Long id, 
		String nome, 
		String mediaAvaliacoes,
		String totalAvaliacoes,
		DetalheDto detalhe,
		ContatoDto contato,
		EnderecoDto endereco) { }
