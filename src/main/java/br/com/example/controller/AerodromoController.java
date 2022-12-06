package br.com.example.controller;

import br.com.example.model.AerodromoVO;
import br.com.example.repository.AerodromoRepository;
import java.util.List;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Aerodromos API", version = "1.0", description = "Dados de Aerodromos"))
public class AerodromoController {

    @Autowired
    private AerodromoRepository repository;

    @GetMapping("/listaraerodromosporEstado/{sigla}")
    public List<AerodromoVO> listarAerodromosporEstado(@PathVariable String sigla) {
        List<AerodromoVO> result = repository.listarAerodromosporEstado(sigla);
        return result;
    }

}