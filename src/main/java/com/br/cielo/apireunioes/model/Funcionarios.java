package com.br.cielo.apireunioes.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Funcionarios extends Pessoa{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDateTime dataAniversario;

}
