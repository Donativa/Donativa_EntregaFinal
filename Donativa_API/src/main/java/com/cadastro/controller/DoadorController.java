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

import com.cadastro.model.Doador;
import com.cadastro.serviceImpl.DoadorServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("doador")
public class DoadorController {

	@Autowired
	private DoadorServiceImpl service;
	
	@GetMapping("{id_doador}")
	public ResponseEntity<Doador> getDoadorById(@PathVariable("id_doador") long id_doador) {
		return new ResponseEntity<Doador>(service.getDoadorById(id_doador), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Doador>> findAll() {
		List<Doador> doador = service.getAllDoador();
		return ResponseEntity.ok().body(doador);
	}
	
	@PostMapping
	public ResponseEntity<Doador> saveDoador(@RequestBody Doador doador) {
		return new ResponseEntity<Doador>(service.saveDoador(doador), HttpStatus.CREATED);
	}
	
	@PutMapping("{id_doador}")
	public ResponseEntity<Doador> updateDoador(@PathVariable("id_doador") long id_doador, @RequestBody Doador doador) {
		return new ResponseEntity<Doador>(service.saveDoador(doador), HttpStatus.OK);
	}
	
	@DeleteMapping("{id_doador}")
	public ResponseEntity<String> deleteDoador(@PathVariable("id_doador") long id_doador) {
		service.deleteDoador(id_doador);
		
		return new ResponseEntity<String>("Doador deletado com sucesso!", HttpStatus.OK);
	}
	
}
