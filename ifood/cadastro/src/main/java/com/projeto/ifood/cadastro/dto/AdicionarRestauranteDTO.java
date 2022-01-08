package com.projeto.ifood.cadastro.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AdicionarRestauranteDTO {
	
	 @NotNull
	 @NotEmpty
	 public String propietario;
	 
	 @NotNull
	 @NotEmpty
	 public String cnpj;
	 
	 @NotNull
	 @NotEmpty
	 public String nome;
	 
	 public LocalizacaoDTO localizacao;
	 
}
