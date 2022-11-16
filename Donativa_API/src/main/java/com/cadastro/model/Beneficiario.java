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
@Table(name = "beneficiario")
public class Beneficiario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_beneficiario;
	
	@Column(name = "nome_bn", nullable = false)
	private String nome_bn;
	
	@Column(name = "cpf_bn", nullable = false)
	private String cpf_bn;
	
	@Column(name = "rg_bn", nullable = false)
	private String rg_bn;
	
	@Column(name = "data_nasc_bn", nullable = false)
	private LocalDate data_nasc_bn;
	
	@Column(name = "telefone_bn", nullable = false)
	private int telefone_bn;
	
	@Column(name = "aceite_termos_bn", nullable = false)
	private boolean aceite_termos_bn;
	
	@OneToOne
	@JoinColumn(name = "fk_usuario")
	private Usuarios usuario;

	@OneToOne
	@JoinColumn(name = "fk_endereco")
	private Endereco endereco;
}
