package com.brito.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brito.financas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
