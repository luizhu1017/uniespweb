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
@Table(name = "tb_filme")
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "filme_id")
    private Integer id;

    @Column(name = "titulo", length = 100)
    @NotNull
    @Max(100)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

}
