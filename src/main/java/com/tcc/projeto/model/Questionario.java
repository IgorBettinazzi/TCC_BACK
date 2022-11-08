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
    private Integer id;

    @NotNull
    @Column(name = "pergunta")
    private String pergunta;

    @NotNull
    @Column(name = "ponto")
    private String ponto;

    @NotNull
    @Column(name = "dependencia")
    private String dependencia;


    @NotNull
    @Column(name = "status")
    private String status;



}