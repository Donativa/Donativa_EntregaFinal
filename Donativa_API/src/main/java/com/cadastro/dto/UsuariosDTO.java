package com.cadastro.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuariosDTO {

	private String nome_usuario;
	private String email;
	private String senha;
}
