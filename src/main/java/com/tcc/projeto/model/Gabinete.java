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
@Table(name = "gabinete")
public class Gabinete {

    @Id
    @Column(name = "idgabinete")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "marca")
    private String marca;

    @NotNull
    @Column(name = "tamanho")
    private String tamanho;

    @NotNull
    @Column(name = "preco")
    private String preco;


}
