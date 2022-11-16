package com.cadastro.controller;

import java.util.List;

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

import com.cadastro.model.Beneficiario;
import com.cadastro.serviceImpl.BeneficiarioServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("beneficiario")
public class BeneficiarioController {

	@Autowired
	private BeneficiarioServiceImpl service;
	
	@GetMapping("{id_beneficiario}")
	public ResponseEntity<Beneficiario> getBeneById(@PathVariable("id_beneficiario") long id_beneficiario) {
		return new ResponseEntity<Beneficiario>(service.getBeneById(id_beneficiario), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Beneficiario>> findAll() {
		List<Beneficiario> bene = service.getAllBene();
		return ResponseEntity.ok().body(bene);
	}
	
	@PostMapping
	public ResponseEntity<Beneficiario> saveBene(@RequestBody Beneficiario beneficiario) {
		return new ResponseEntity<Beneficiario>(service.saveBene(beneficiario), HttpStatus.CREATED);
	}
	
	@PutMapping("{id_beneficiario}")
	public ResponseEntity<Beneficiario> updateBene(@PathVariable("id_beneficiario") long id_beneficiario, @RequestBody Beneficiario beneficiario) {
		return new ResponseEntity<Beneficiario>(service.updateBene(beneficiario, id_beneficiario), HttpStatus.OK);
	}
	
	@DeleteMapping("{id_beneficiario}")
	public ResponseEntity<String> deleteBene(@PathVariable("id_beneficiario") long id_beneficiario) {
		service.deleteBene(id_beneficiario);
		
		return new ResponseEntity<String>("Beneficiario deletado", HttpStatus.OK);
	}
	
}
