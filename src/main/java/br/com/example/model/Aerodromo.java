package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "outros_aerodromos_2014")
public class Aerodromo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "nm_municip")
    private String municipio;
    @Column(name = "tipoaero")
    private String tipo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "uf")
    private String estado;
    @Column(name = "cod_uso")
    private String codigoUso;
    @Column(name = "cod_icao")
    private String codidoIcao;
    @Column(name = "geocodigo")
    private String geoCodigo;    
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

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoUso() {
        return codigoUso;
    }

    public void setCodigoUso(String codigoUso) {
        this.codigoUso = codigoUso;
    }

    public String getCodidoIcao() {
        return codidoIcao;
    }

    public void setCodidoIcao(String codidoIcao) {
        this.codidoIcao = codidoIcao;
    }

    public String getGeoCodigo() {
        return geoCodigo;
    }

    public void setGeoCodigo(String geoCodigo) {
        this.geoCodigo = geoCodigo;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Aerodromo{" + "gid=" + gid + ", codigo=" + codigo + ", municipio=" + municipio + ", tipo=" + tipo + ", nome=" + nome + ", estado=" + estado + ", codigoUso=" + codigoUso + ", codidoIcao=" + codidoIcao + ", geoCodigo=" + geoCodigo + ", geometria=" + geometria + '}';
    }

    
}