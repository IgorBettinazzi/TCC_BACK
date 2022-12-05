package com.tcc.projeto.repository;


import com.tcc.projeto.model.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacaDeVideoRepository extends JpaRepository<Gpu, Integer> {


}