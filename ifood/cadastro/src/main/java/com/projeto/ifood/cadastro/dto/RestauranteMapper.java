package com.projeto.ifood.cadastro.dto;

import org.mapstruct.Mapper;

import com.projeto.ifood.cadastro.Restaurante;

@Mapper(componentModel = "cdi")
public interface RestauranteMapper {

	public Restaurante toRestaurante(AdicionarRestauranteDTO dto);
}
