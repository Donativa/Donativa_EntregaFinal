package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.Endereco;
import com.cadastro.repositories.EnderecoRepository;

@Service
public class EnderecoServiceImpl {

	@Autowired
	private EnderecoRepository repository;
	 
	public Endereco saveEndereco(Endereco endereco) {
		return repository.save(endereco);
	}
	
	public List<Endereco> getAllEndereco() {
		return repository.findAll();
	}
	 
	public Endereco getEnderecoById(long id_endereco) {
		return repository.findById(id_endereco).orElseThrow(()
				-> new ResourceNotFoundException("Endereço", "id", id_endereco));
	}
	
	public Endereco updateEndereco(Endereco endereco, long id_endereco) {
		
		Endereco existe = repository.findById(id_endereco).orElseThrow(()
				-> new ResourceNotFoundException("Endereço", "id", id_endereco));
				
				existe.setRua(endereco.getRua());
				existe.setNumero(endereco.getNumero());
				existe.setCep(endereco.getCep());
				existe.setBairro(endereco.getBairro());
				existe.setCidade(endereco.getCidade());
				existe.setEstado(endereco.getEstado());
				
				repository.save(existe);
				return existe;
	}
	
	public void deleteEndereco(long id_endereco) {
		repository.findById(id_endereco).orElseThrow(()
				-> new ResourceNotFoundException("Endereco", "id", id_endereco));
	}
}
