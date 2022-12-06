package br.com.example.controller;

import br.com.example.repository.FerroviaRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Ferrovias API", version = "1.0", description = "Dados de Ferrovias"))
public class FerroviaController {
  @Autowired
  private FerroviaRepository repository;

  @GetMapping("/quantidadeFerroviasMunicipio/{nome}")
    public Integer quantidadeFerroviasMunicipio(@PathVariable String nome) {
        Integer result = repository.quantidadeFerroviasMunicipio(nome);
        return result;
    }
}
