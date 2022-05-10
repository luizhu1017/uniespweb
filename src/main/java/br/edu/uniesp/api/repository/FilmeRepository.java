package br.edu.uniesp.api.repository;

import br.edu.uniesp.api.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Integer> {
    List<Filme> findByTitulo(String titulo);
    @Query("select f.genero from Filme f where " +
            "f.genero.nome =:genero")
    List<Filme> buscaPorGenero(@Param("genero") String genero);
}
