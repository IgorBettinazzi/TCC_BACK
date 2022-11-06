package com.tcc.projeto.repository;

import com.tcc.projeto.model.Questionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntasRepository extends JpaRepository<Questionario, Integer> {


}
