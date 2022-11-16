package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.Beneficiario;
import com.cadastro.repositories.BeneficiarioRepository;
import com.cadastro.service.BeneficiarioService;

@Service
public class BeneficiarioServiceImpl implements BeneficiarioService {

	@Autowired
	private BeneficiarioRepository repository;
	
	@Override
	public Beneficiario saveBene(Beneficiario beneficiario ) {
		return repository.save(beneficiario);
	}
	
	@Override
	public List<Beneficiario> getAllBene() {
		return repository.findAll();
	}
	
	@Override
	public Beneficiario getBeneById(long id_beneficiario) {
		return repository.findById(id_beneficiario).orElseThrow(()
				-> new ResourceNotFoundException("Beneficiario", "id", id_beneficiario));
	}
	
	@Override
	public Beneficiario updateBene(Beneficiario beneficiario, long id_beneficiario) {
		
		Beneficiario existe = repository.findById(id_beneficiario).orElseThrow(()
				-> new ResourceNotFoundException("Beneficiario", "id", id_beneficiario));
		
		existe.setNome_bn(beneficiario.getNome_bn());
		existe.setCpf_bn(beneficiario.getCpf_bn());
		existe.setRg_bn(beneficiario.getRg_bn());
		existe.setData_nasc_bn(beneficiario.getData_nasc_bn());
		existe.setTelefone_bn(beneficiario.getTelefone_bn());
		existe.setUsuario(beneficiario.getUsuario());
		existe.setEndereco(beneficiario.getEndereco());
		
		repository.save(existe);
		return existe;		
	}
	
	@Override
	public void deleteBene(long id_beneficiario) {
		repository.findById(id_beneficiario).orElseThrow(()
				-> new ResourceNotFoundException("Beneficiario", "id", id_beneficiario));
	}
}
