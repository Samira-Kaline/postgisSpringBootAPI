package br.com.example.repository;

import br.com.example.model.Ferrovia;
import br.com.example.model.FerroviaVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FerroviaRepository extends JpaRepository<Ferrovia, Integer>{
  @Query(value = "select count(*) from Ferrovia f,Municipio m where st_within(f.geometria,m.geometria) = true and m.nome = :nome")
  Integer quantidadeFerroviasMunicipio(String nome);

  @Query(value = "select new br.com.example.model.FerroviasVO(b.codigo,b.ferrovia) from Ferrovias a, Ferrovias b where within(a.geometria, b.geometria) = true and a.operadora = :operadora")
    List<FerroviaVO> ferroviasDaVale(String operadora);
    
   @Query(value = "select count(*) from Ferrovias f, Estado e where within(f.geometria, e.geometria) = true and e.nome = :estado ")
    public Integer quantidadeDeFerroviasPorEstado(String estado);
}
