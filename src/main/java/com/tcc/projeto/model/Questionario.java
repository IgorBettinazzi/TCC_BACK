package com.tcc.projeto.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questionario")
public class Questionario {

    @Id
    @Column(name = "idpergunta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "pergunta")
    private String pergunta;

    @NotNull
    @Column(name = "pontos")
    private String pontos;

    @NotNull
    @Column(name = "dependencia")
    private String dependencia;


    @NotNull
    @Column(name = "status")
    private String status;



}