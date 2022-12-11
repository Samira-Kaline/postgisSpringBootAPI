package br.com.example.repository;

import br.com.example.model.Municipio;
import br.com.example.model.MunicipioVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface MunicipioRepository extends JpaRepository<Municipio, Integer>{

    @Query(value = "select new br.com.example.model.MunicipioVO(m.nome,m.areaKm2) from Municipio m, Estado e where st_within(m.geometria,e.geometria) = true and e.sigla = :sigla ")
    public List<MunicipioVO> areadosMuniciosdoEstado(String sigla);

    @Query(value = "select  new br.com.example.model.MunicipioVO(m.nome,m.areaKm2) from Municipio m where m.areaKm2 > :area")
    public List<MunicipioVO> areaMunicipioehMaior(Double area);

    @Query(value = "select  m.nome from Municipio m where  st_perimeter(m.geometria) = :perimetro")
    public List<String> municipioPorPerimetro(Double perimetro);

    @Query(value = "select m1.nome from Municipio m1,Municipio m2 where st_equals(m1.geometria,m2.geometria) = true and m1.nome = :nome1 and m2.nome = :nome2")
    public String municipioSaoIguais(String nome1,String nome2);

    @Query(value = "select count(*) from Municipio m, Estado e where within(m.geometria, e.geometria) = true and e.sigla = :sigla")
    public Integer quantidadeDeMunicipiosPorEstado(String sigla);
   
    @Query(value = "select new br.com.example.model.MunicipioVO(m.codigo, m.nome) from Municipio m")
    List<MunicipioVO> listarMunicipiosDoBrasil();
    
    @Query(value = "select new br.com.example.model.MunicipioVO(mb.codigo,mb.nome) from Municipio ma, Municipio mb where touches(ma.geometria, mb.geometria) = true and ma.nome = :nome")
    List<MunicipioVO> listaDeMunicipiosVizinhos(String nome);
}
