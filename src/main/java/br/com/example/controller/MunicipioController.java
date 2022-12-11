package br.com.example.controller;

import java.util.List;
import br.com.example.model.MunicipioVO;
import br.com.example.repository.MunicipioRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Municípios API", version = "1.0", description = "Dados de Municípios"))
public class MunicipioController {

    @Autowired
    private MunicipioRepository repository;


    @GetMapping("/areadosMuniciosdoEstado/{sigla}")
    public List<MunicipioVO> areadosMuniciosdoEstado(@PathVariable String sigla) {
        List<MunicipioVO> result = repository.areadosMuniciosdoEstado(sigla);
        return result;
    }

    @GetMapping("/areaMunicipioehMaior/{area}")
    public List<MunicipioVO> areaMunicipioehMaior(@PathVariable Double area) {
        List<MunicipioVO> result = repository.areaMunicipioehMaior(area);
        return result;
    }

    @GetMapping("/municipioPorPerimetro/{perimetro}")
    public List<String> municipioPorPerimetro(@PathVariable Double perimetro) {
        List<String> result = repository.municipioPorPerimetro(perimetro);
        return result;
    }

    @GetMapping("/municipioSaoIguais/{nome1}/{nome2}")
    public Boolean municipioSaoIguais(@PathVariable String nome1,@PathVariable String nome2) {
        String result = repository.municipioSaoIguais(nome1,nome2);
        return !(result == null || result == "");
    }

    @GetMapping("/quantidadeDeMunicipiosPorEstado/{sigla}")
     public Integer quantidadeDeMunicipiosPorEstado(@PathVariable String sigla){
        int result = repository.quantidadeDeMunicipiosPorEstado(sigla);
        return result;
    }
    @GetMapping("/listarMunicipiosDoBrasil/{nome}")
    public List<MunicipioVO> listarMunicipiosDoBrasil(){
        List<MunicipioVO> result = repository.listarMunicipiosDoBrasil();
        return result;
    }
    
    @GetMapping("/listaDeMunicipiosVizinhos/{nome}")
    public List<MunicipioVO> municipiosVizinhos(@PathVariable String nome){
        List<MunicipioVO> result = repository.listaDeMunicipiosVizinhos(nome);
        return result;
    }
}
