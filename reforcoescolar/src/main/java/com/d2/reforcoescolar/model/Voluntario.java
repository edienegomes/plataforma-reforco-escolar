package com.d2.reforcoescolar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "/tb_voluntario")
public class Voluntario extends Pessoa {

    private boolean ativo;

    @NotBlank
    private String area;

}
