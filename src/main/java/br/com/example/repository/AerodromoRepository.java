package br.com.example.repository;

import br.com.example.model.Aerodromo;
import br.com.example.model.AerodromoVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AerodromoRepository extends JpaRepository<Aerodromo,Integer>{
  @Query(value = "select new br.com.example.model.AerodromoVO(a.codigo,a.municipio) from Aerodromo a,Estado e where st_within(a.geometria, e.geometria) = true and a.estado = :sigla and e.sigla = :sigla")
  public List<AerodromoVO> listarAerodromosporEstado(String sigla);
}