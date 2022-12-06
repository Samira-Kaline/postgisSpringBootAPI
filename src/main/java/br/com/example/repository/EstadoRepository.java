package br.com.example.repository;

import br.com.example.model.Estado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EstadoRepository extends JpaRepository<Estado,Integer>{

  @Query(value = "select e2.nome from Estado e1, Estado e2 where st_touches(e1.geometria,e2.geometria) = true and e1.sigla = :sigla")
  public List<String> litarFronteirasdoEstado(String sigla);

  @Query(value = "select e2.nome from Estado e1, Estado e2 where st_area(e1.geometria) < st_area(e2.geometria)and e1.sigla = :sigla")
  public List<String> estadoscomareaMaior(String sigla);

  @Query(value = "select  e.nome from Estado e where  st_perimeter(e.geometria) = :perimetro")
  public List<String> estadoPorPerimetro(Double perimetro);
}

