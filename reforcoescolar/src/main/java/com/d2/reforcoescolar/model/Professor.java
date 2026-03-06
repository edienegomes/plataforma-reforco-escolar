package com.d2.reforcoescolar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "/tb_professor")
public class Professor extends Pessoa{
    @NotBlank
    private String disciplina;
}
