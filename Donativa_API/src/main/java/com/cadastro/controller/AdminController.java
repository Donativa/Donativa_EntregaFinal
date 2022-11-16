package com.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.model.Admin;
import com.cadastro.serviceImpl.AdminServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("administrador")
public class AdminController {

	@Autowired
	private AdminServiceImpl service;
	
	@GetMapping("{id_adm}")
	public ResponseEntity<Admin> getAdminById(@PathVariable("id_adm") long id_adm) {
		return new ResponseEntity<Admin>(service.getAdminById(id_adm), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<Admin>(service.saveAdmin(admin), HttpStatus.CREATED);
	}
	
	@PutMapping("{id_adm}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable("id_adm") long id_adm, @RequestBody Admin admin) {
		return new ResponseEntity<Admin>(service.updateAdmin(admin, id_adm), HttpStatus.OK);
	}
	
	@DeleteMapping("{id_adm}")
	public ResponseEntity<String> deleteAdmin(@PathVariable("id_adm") long id_adm) {
		service.deleteAdmin(id_adm);
		
		return new ResponseEntity<String>("Administrador deletado.", HttpStatus.OK);
	}
}
