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
@Table(name = "placa_mae")
public class PlacaMae {


    @Id
    @Column(name = "idplaca_mae")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "marca")
    private String marca;

    @NotNull
    @Column(name = "tipo")
    private String tipoPlaca;

    @NotNull
    @Column(name = "modelo")
    private String modelo;

    @NotNull
    @Column(name = "preco")
    private String preco;

}
