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
@Table(name = "ssd")
public class ssd {

    @Id
    @Column(name = "idssd")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "marca")
    private String marca;

    @NotNull
    @Column(name = "modelo")
    private String modelo;

    @NotNull
    @Column(name = "velocidade")
    private String velocidade;

    @NotNull
    @Column(name = "preco")
    private String preco;


}
