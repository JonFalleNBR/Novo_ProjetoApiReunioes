package com.br.cielo.apireunioes.model.dtos;


import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Organizador extends Pessoa{

    private String setor;
}
