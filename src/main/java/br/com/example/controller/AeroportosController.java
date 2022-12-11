package br.com.example.controller;

import br.com.example.repository.AeroportosRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import br.com.example.model.AeroportoVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Todas as API's", version = "1.0", description = "Todos os Dados"))
public class AeroportosController {
    
    @Autowired
    private AeroportosRepository repository;

   
   @GetMapping("/listarAeroportosInternaciaonais")
    public List<AeroportoVO> listarAeroportosInternaciaonais(){
        List<AeroportoVO> result= repository.listarAeroportosInternaciaonais();
        return result;
    }
    @GetMapping("/quantidadeDosAeroportosDoBrasil")
    public Integer quantidadeDosAeroportosDoBrasil(){
        int result = repository.quantidadeDosAeroportosDoBrasil();
        return result;
    }
    
}