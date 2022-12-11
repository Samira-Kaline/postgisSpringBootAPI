/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.example.controller;

import java.util.List;
import br.com.example.repository.CidadeGemeaRepository;
import br.com.example.model.CidadeGemeaVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author euridyce
 */
@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Consultas API", version = "1.0", description = "Dados das Consultas"))
public class CidadeGemeaController {

    @Autowired
    private CidadeGemeaRepository repository;
    
    @GetMapping("/cidadesGemeasPorRegiao/{regiao}")
    public List<CidadeGemeaVO> cidadesGemeasPorRegiao(@PathVariable String regiao){
        List<CidadeGemeaVO> result = repository.cidadesGemeasPorRegiao(regiao);
        return result;
    }
}

