package br.com.example.controller;

import br.com.example.repository.EstadoRepository;
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
@OpenAPIDefinition(info = @Info(title = "Estados API", version = "1.0", description = "Dados de Estados"))
public class EstadoController {

    @Autowired
    private EstadoRepository repository;

    @GetMapping("/litarFronteirasdoEstado/{sigla}")
    public List<String> litarFronteirasdoEstado(@PathVariable String sigla) {
        List<String> result = repository.litarFronteirasdoEstado(sigla);
        return result;
    }

    @GetMapping("/estadoscomareaMaior/{sigla}")
    public List<String> estadoscomareaMaior(@PathVariable String sigla) {
        List<String> result = repository.estadoscomareaMaior(sigla);
        return result;
    }

    @GetMapping("/estadoPorPerimetro/{perimetro}")
    public List<String> estadoPorPerimetro(@PathVariable Double perimetro) {
        List<String> result = repository.estadoPorPerimetro(perimetro);
        return result;
    }

    @GetMapping("/totalDeMunicipiosNoEstado/{UF}")
    public Double listarMunicipiosDentroDeUmEstado(@PathVariable String UF){
        double result = repository.totalDeMunicipiosNoEstado(UF);
        return result;
    }
    @GetMapping("/distanciaEntreEstados/{estadoA}/{estadoB}")
    public Double distanciaEntreEstados(@PathVariable String estadoA, @PathVariable String estadoB){
        double result = repository.distanciaEntreEstados(estadoA, estadoB);
        return result;
    }
}
