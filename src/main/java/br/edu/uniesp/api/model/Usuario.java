package br.edu.uniesp.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
public class Usuario {

    @Id
    private Long id;

    @NotEmpty
    private String nome;

    @Email
    private String email;
}
