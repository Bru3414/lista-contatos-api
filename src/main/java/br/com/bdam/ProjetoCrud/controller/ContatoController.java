package br.com.bdam.ProjetoCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bdam.ProjetoCrud.entity.ContatoEntity;
import br.com.bdam.ProjetoCrud.service.ContatoService;

@CrossOrigin(origins = "https://lista-contatos-redux-ten.vercel.app/")
@RestController
@RequestMapping(value = "/")
public class ContatoController {
	
	@Autowired
	private ContatoService contatoService;

	@CrossOrigin(origins = "https://lista-contatos-redux-ten.vercel.app/")
	@GetMapping
	public List<ContatoEntity> buscarTodos() {
		return contatoService.buscarTodos();
	}
	
	@PostMapping
	public ContatoEntity cadastrar(@RequestBody ContatoEntity contato) {
		return contatoService.cadastrar(contato);
	}
	
	@PutMapping
	public void alterar(@RequestBody ContatoEntity contato) {
		contatoService.alterar(contato);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		contatoService.excluir(id);
	}
}
