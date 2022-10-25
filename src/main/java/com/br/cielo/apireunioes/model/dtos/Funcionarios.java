package com.br.cielo.apireunioes.model.dtos;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Funcionarios extends Pessoa{


    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDateTime dataAniversario;

}
