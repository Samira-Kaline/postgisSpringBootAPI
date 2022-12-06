package br.com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FronteiraVO {
    private String codigo;
    private String municipio;
    private String estado;
}
