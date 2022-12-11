/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Armazem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface ArmazemRepository extends JpaRepository<Armazem, Integer>{
   
    @Query(value = "select count(*) from Armazem am, Estado e where within(am.geometria, e.geometria) = true and e.nome = :estado ")
    public Integer quantidadeDeArmazensPorEstado(String estado);
     
   
   
}


