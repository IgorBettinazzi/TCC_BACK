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
@Table(name = "resposta")
public class Resposta {


    @Id
    @Column(name = "id_resposta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "nome_usuario")
    private String nome_usuario;

    @NotNull
    @Column(name = "soma")
    private double soma;

    @NotNull
    @Column(name = "media")
    private double media;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "idpergunta")
    private Questionario idpergunta;


}