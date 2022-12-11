/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.CidadeGemea;
import br.com.example.model.CidadeGemeaVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 *
 * @author euridyce
 */
public interface CidadeGemeaRepository extends JpaRepository<CidadeGemea, Integer>{
    
    /*Cidades Gêmeas por Estado*/
    
   @Query(value = "select new br.com.example.model.CidadeGemeaVO(cd.codigo, cd.municipio) from CidadeGemea c, CidadeGemea cd where within(c.geometria, cd.geometria) = true and c.nome = :regiao")
    List<CidadeGemeaVO> cidadesGemeasPorRegiao(String regiao);
    

}

