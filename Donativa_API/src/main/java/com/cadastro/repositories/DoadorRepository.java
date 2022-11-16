package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.model.Doador;

public interface DoadorRepository extends JpaRepository<Doador, Long> {

}
