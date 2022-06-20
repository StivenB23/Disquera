package com.sena.disquera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGenero;

    @Column(name="nombregenero", length=50, nullable=false)
    @NotEmpty
    private String nombreGenero;
    
    @Column(name="estadogenero", length=1, nullable=false)
    private Boolean estadoGenero;
  
    
    // constructor vacio
    public Genero() {
        
    }

    public Genero(Integer idGenero, String nombreGenero, Boolean estadoGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
        this.estadoGenero = estadoGenero;
    }

    // metodos accesores
    public Integer getIdGenero() {
        return idGenero;
    }


    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }


    public String getNombreGenero() {
        return nombreGenero;
    }


    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }


    public Boolean getEstadoGenero() {
        return estadoGenero;
    }


    public void setEstadoGenero(Boolean estadoGenero) {
        this.estadoGenero = estadoGenero;
    }
    
}
