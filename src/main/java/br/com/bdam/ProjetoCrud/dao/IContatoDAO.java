package br.com.bdam.ProjetoCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bdam.ProjetoCrud.entity.ContatoEntity;

public interface IContatoDAO extends JpaRepository<ContatoEntity, Long> {
	
}
