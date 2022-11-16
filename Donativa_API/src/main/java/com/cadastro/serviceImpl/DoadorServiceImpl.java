package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.Doador;
import com.cadastro.repositories.DoadorRepository;
import com.cadastro.repositories.DoadorService;

@Service
public class DoadorServiceImpl implements DoadorService {

	@Autowired
	private DoadorRepository repository;
	
	@Override
	public Doador saveDoador(Doador doador) {
		return repository.save(doador);
	}
	
	@Override
	public List<Doador> getAllDoador() {
		return repository.findAll();
	}
	
	@Override
	public Doador getDoadorById(long id_doador) {
		return repository.findById(id_doador).orElseThrow(()
				-> new ResourceNotFoundException("Doador", "id", id_doador));
	}
	
	@Override
	public Doador update(Doador doador, long id_doador) {
		
		Doador existe = repository.findById(id_doador).orElseThrow(()
				-> new ResourceNotFoundException("Doador", "id", id_doador));
		
		existe.setNome_doador(doador.getNome_doador());
		existe.setCpf_doador(doador.getCpf_doador());
		existe.setCnpj_doador(doador.getCnpj_doador());
		existe.setData_nasc_dd(doador.getData_nasc_dd());
		existe.setEndereco(doador.getEndereco());
		existe.setUsuario(doador.getUsuario());
		
		repository.save(existe);
		return existe;
	}
	
	@Override
	public void deleteDoador(long id_doador) {
		repository.findById(id_doador).orElseThrow(()
				-> new ResourceNotFoundException("Doador", "id", id_doador));
	}
}
