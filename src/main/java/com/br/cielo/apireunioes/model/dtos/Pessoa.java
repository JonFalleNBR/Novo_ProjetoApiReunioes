package com.br.cielo.apireunioes.model.dtos;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Pessoa {


    private String nome;
    private String idade;
    private String cargo;

}
