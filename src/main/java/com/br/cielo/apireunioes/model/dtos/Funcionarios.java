package com.br.cielo.apireunioes.model.dtos;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Entity
public class Funcionarios extends Pessoa{


    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDateTime dataAniversario;

}
