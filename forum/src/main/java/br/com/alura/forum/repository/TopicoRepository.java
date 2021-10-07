package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    //Padrão de nomenclatura. _ para relação entre objeto.
    List<Topico> findByCurso_Nome(String nomeCurso);


    //This is bad!!
    @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    List<Topico> acharPeloCurso(String nomeCurso);
}
