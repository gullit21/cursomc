package com.gti.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gti.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
