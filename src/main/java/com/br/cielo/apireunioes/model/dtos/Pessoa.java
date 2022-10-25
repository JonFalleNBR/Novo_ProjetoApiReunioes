package com.br.cielo.apireunioes.model.dtos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import javax.persistence.*;

@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nome;
    private String idade;
    private String cargo;


}
