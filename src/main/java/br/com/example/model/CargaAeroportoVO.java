package br.com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CargaAeroportoVO {
    private String codigo;
    private String nome;
    private String carga;
}
