package br.com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AeroportoVO {
    private String codigo;
    private String municipio;
    private String nome;
}
