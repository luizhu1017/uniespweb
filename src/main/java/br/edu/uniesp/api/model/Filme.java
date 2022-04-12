package br.edu.uniesp.api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_filme")
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "filme_id")
    private Integer id;

    @Column(name = "titulo", length = 100)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
