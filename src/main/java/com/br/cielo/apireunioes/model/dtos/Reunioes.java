package com.br.cielo.apireunioes.model.dtos;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
public class Reunioes {

    @NotBlank
    private Organizador organizador;
    @NotBlank
    private Funcionarios participantes;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;

    private String Assunto;
}
