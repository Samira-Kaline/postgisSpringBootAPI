package br.com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArmazemVO {
    private String codigo;
    private String municipio;
    private String capacidade;
}
