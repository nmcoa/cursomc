package com.OliEnterprise.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OliEnterprise.cursomc.domain.Categoria;
import com.OliEnterprise.cursomc.repositories.CategoriaRepo;
import java.util.Optional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepo repo;
	
	public Categoria procurar(int id){
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
