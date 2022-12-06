package br.com.example.repository;

import br.com.example.model.Rodovia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RodoviaRepository extends JpaRepository<Rodovia, Integer> {

  @Query(value = "select count(r.geometria) from Rodovia r, Municipio m where st_within(r.geometria,m.geometria) = true and m.nome = :nome")
  Integer quantidadeRodoviasMunicipio(String nome);
}
