package com.longevida.controller;

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

import com.longevida.model.Categoria;
import com.longevida.repository.CategoriaRepository;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/categorias")
public class CategoriaController {
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/categoria/{categoria}")
	public ResponseEntity<List<Categoria>> getByName(@PathVariable String categoria){
		return ResponseEntity.ok(repository.findAllByCategoriaIgnoreCaseContaining(categoria));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	/*ALTERAÇÃO FEITA*/
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> put (@RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	@DeleteMapping("/{id}") 
	public void delete(@PathVariable long id){
		repository.deleteById(id);
	}
}
