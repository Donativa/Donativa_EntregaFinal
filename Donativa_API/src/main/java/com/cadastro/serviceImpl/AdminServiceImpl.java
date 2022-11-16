package com.cadastro.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.Admin;
import com.cadastro.repositories.AdminRepository;
import com.cadastro.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository repository;
	
	@Override
	public Admin saveAdmin(Admin admin) {
		return repository.save(admin);
	}
	
	@Override
	public Admin getAdminById(long id_adm) {
		return repository.findById(id_adm).orElseThrow(()
				-> new ResourceNotFoundException("Aministrador", "id", id_adm));
	}
	
	@Override
	public Admin updateAdmin(Admin admin, long id_adm) {
	
		Admin existe = repository.findById(id_adm).orElseThrow(()
				-> new ResourceNotFoundException("Administrador", "id", id_adm));
		

		existe.setNome_adm(admin.getNome_adm());
		existe.setUsuarios(admin.getUsuarios());
		
		repository.save(existe);
		return existe;
	}
	
	@Override
	public void deleteAdmin(long id_adm) {
		repository.findById(id_adm).orElseThrow(()
				-> new ResourceNotFoundException("Administrador", "id", id_adm));
	}
}
