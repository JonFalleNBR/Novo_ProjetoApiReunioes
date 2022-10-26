package com.br.cielo.apireunioes.model.dtos;


import com.br.cielo.apireunioes.repository.ApiReunioesRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.function.ObjDoubleConsumer;

@Getter
@Setter
@Entity
@Table(name ="REUNIOES")
public class Reunioes {


    @Autowired
    ApiReunioesRepository apiReunioesRepository;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @OneToOne
    private Organizador organizador;
    @NotBlank
    @ManyToOne
    private Funcionarios participantes;

    @OneToOne
    private String Assunto;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    @OneToOne
    private LocalDate data;

    public Reunioes(){}

}
