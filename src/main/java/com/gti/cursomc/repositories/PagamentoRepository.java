package com.gti.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gti.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
