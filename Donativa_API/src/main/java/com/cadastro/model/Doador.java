package com.cadastro.model;

import java.time.LocalDate;

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

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "doador")
public class Doador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_doador;
	
	@Column(name = "nome_doador", nullable = false)
	private String nome_doador;
	
	@Column(name = "cpf_doador", nullable = false)
	private String cpf_doador;
	
	@Column(name = "cnpj_doador", nullable = false)
	private String cnpj_doador;
	
	@Column(name = "data_nasc_dd", nullable = false)
	private LocalDate data_nasc_dd;
	
	@Column(name = "aceite_termos_doador", nullable = false)
	private boolean aceite_termos_doador;
	
	@OneToOne
	@JoinColumn(name = "fk_usuario")
	private Usuarios usuario;
	
	@OneToOne
	@JoinColumn(name = "fk_endereco")
	private Endereco endereco;
}
