package br.edu.uniesp.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_contato")
public class Contato implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "filme_id")
    private Integer id;

    private String name;
    private String accountNumber;
}
