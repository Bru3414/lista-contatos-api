package br.com.bdam.ProjetoCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bdam.ProjetoCrud.dao.IContatoDAO;
import br.com.bdam.ProjetoCrud.entity.ContatoEntity;

@Service
public class ContatoService {
	
	@Autowired
	private IContatoDAO contatoDAO;
	
	public List<ContatoEntity> buscarTodos() {
		List<ContatoEntity> contatos = contatoDAO.findAll();
		return contatos;
	}

	public ContatoEntity cadastrar(ContatoEntity contato) {
		return contatoDAO.save(contato);
	}

	public void alterar(ContatoEntity contato) {
		contatoDAO.save(contato);
	}

	public void excluir(Long id) {
		ContatoEntity contato = contatoDAO.findById(id).get();
		contatoDAO.delete(contato);
	}
}