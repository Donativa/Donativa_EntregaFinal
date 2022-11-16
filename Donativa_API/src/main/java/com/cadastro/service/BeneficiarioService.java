package com.cadastro.service;

import java.util.List;

import com.cadastro.model.Beneficiario;

public interface BeneficiarioService {

	Beneficiario saveBene(Beneficiario beneficiario);
	Beneficiario updateBene(Beneficiario beneficiario, long id_beneficiario);
	Beneficiario getBeneById(long id_beneficiario);
	List<Beneficiario> getAllBene();
	void deleteBene(long id_beneficiario);
}
