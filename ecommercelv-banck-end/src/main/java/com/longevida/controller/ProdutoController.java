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

import com.longevida.model.Produtos;
import com.longevida.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> GetAll(){
		
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> GetById(@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/produto/{produto}")
	public ResponseEntity<List<Produtos>> GetByproduto(@PathVariable String produto){
		return ResponseEntity.ok(repository.findAllByNameProdutoIgnoreCaseContaining(produto));
	}
	
	
	@PostMapping
	public ResponseEntity<Produtos> post (@RequestBody Produtos produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	/*ALTERAÇÃO FEITA*/
	@PutMapping("/{id}")
	public ResponseEntity<Produtos> put (@RequestBody Produtos produto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}	
}
