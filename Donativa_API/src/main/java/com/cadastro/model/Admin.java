package com.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "administrador")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_adm;
	
	@Column(name = "nome_adm", nullable = false)
	private String nome_adm;
	
	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuarios usuarios;
}
