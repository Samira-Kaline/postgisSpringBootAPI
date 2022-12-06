package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "mov_carga_aero_2010")
public class CargaAeroporto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "geocodigo")
    private String geoCodigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "carga__kg_")
    private String carga;   
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

    public String getGeoCodigo() {
        return geoCodigo;
    }

    public void setGeoCodigo(String geoCodigo) {
        this.geoCodigo = geoCodigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "CargaAeroporto{" + "gid=" + gid + ", codigo=" + codigo + ", geoCodigo=" + geoCodigo + ", nome=" + nome + ", carga=" + carga + ", geometria=" + geometria + '}';
    }

    
}