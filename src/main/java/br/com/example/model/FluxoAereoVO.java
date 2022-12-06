package br.com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class FluxoAereoVO {
    private String codigo;
    private String destino;
    private String carga;

}
