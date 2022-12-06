package br.com.example.repository;

import br.com.example.model.Ferrovia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FerroviaRepository extends JpaRepository<Ferrovia, Integer>{
  @Query(value = "select count(*) from Ferrovia f,Municipio m where st_within(f.geometria,m.geometria) = true and m.nome = :nome")
  Integer quantidadeFerroviasMunicipio(String nome);
}
