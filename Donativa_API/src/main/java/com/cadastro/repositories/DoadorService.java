package com.cadastro.repositories;

import java.util.List;

import com.cadastro.model.Doador;

public interface DoadorService {

	Doador saveDoador(Doador doador);
	Doador update(Doador doador, long id_doador);
	Doador getDoadorById(long id_doador);
	List<Doador> getAllDoador();
	void deleteDoador(long id_doador);
}
