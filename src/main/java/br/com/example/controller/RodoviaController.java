package br.com.example.controller;

import br.com.example.repository.RodoviaRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Rodovias API", version = "1.0", description = "Dados de Rodovias"))
public class RodoviaController {

  @Autowired
  private RodoviaRepository repository;

  @GetMapping("/quantidadeRodoviasMunicipio/{nome}")
    public Integer quantidadeRodoviasMunicipio(@PathVariable String nome) {
        Integer result = repository.quantidadeRodoviasMunicipio(nome);
        return result;
    }

  
}
