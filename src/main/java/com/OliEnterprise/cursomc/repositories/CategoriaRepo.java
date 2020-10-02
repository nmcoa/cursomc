package com.OliEnterprise.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OliEnterprise.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepo extends JpaRepository<Categoria, Integer>{
	
	
	
}
