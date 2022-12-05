package com.tcc.projeto.repository;

import com.tcc.projeto.model.Processador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessadorRepository extends JpaRepository<Processador, Integer> {
}
