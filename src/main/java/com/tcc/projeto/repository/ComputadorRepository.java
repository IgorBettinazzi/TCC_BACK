package com.tcc.projeto.repository;

import com.tcc.projeto.model.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ComputadorRepository extends JpaRepository<Computador, Integer> {


}
