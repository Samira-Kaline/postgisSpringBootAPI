/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Aeroporto;
import br.com.example.model.AeroportoVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author diego
 */
public interface AeroportosRepository extends JpaRepository<Aeroporto, Integer>{
    
    @Query(value = "select new br.com.example.model.AeroportosVO(a.codigo, a.municipio, a.uf) from Aeroportos a")
    List<AeroportoVO> listarAeroportosInternaciaonais();
    
    @Query(value = "select count(ae) from Aeroportos ae")
    public Integer quantidadeDosAeroportosDoBrasil();
    
}
