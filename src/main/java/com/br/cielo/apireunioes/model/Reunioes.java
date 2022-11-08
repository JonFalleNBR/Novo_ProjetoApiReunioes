package com.br.cielo.apireunioes.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
@Table(name = "REUNIOES")
public class Reunioes {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Organizador organizador;

    @ManyToOne
    private Funcionarios participantes;

    @OneToOne
    private String Assunto;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    @OneToOne
    private LocalDate data;

    public Reunioes(){}

}
