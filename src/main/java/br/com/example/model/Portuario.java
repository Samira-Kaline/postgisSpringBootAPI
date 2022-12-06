package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "outros_term_portuarios_2014")
public class Portuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "uf")
    private String estado;
    @Column(name = "nome")
    private String nome;
    @Column(name = "geocodig_m")
    private String geoCodigo;
    @Column(name = "nome_munic")
    private String municipio; 
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGeoCodigo() {
        return geoCodigo;
    }

    public void setGeoCodigo(String geoCodigo) {
        this.geoCodigo = geoCodigo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Portuario{" + "gid=" + gid + ", codigo=" + codigo + ", estado=" + estado + ", nome=" + nome + ", geoCodigo=" + geoCodigo + ", municipio=" + municipio + ", geometria=" + geometria + '}';
    }

    
}