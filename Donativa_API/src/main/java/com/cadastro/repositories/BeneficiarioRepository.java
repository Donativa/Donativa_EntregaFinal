package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {

}
