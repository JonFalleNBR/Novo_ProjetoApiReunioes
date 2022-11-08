package com.br.cielo.apireunioes.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String idade;
    private String cargo;




}
