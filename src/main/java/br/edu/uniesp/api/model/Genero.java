package br.edu.uniesp.api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Genero {

    @Id
    @GeneratedValue
    @Column(name = "genero_id")
    private Integer id;
    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "genero")
    private Set<Filme> listaFilmes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
