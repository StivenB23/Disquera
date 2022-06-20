package com.sena.disquera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombrealbum", length=50, nullable=false)
    @NotEmpty
    private String nombreAlbum;
    
    @Column(name="fechapublicacion", length=50, nullable=false)
    @NotEmpty
    private String fechaPublicacion;

    @Column(name="estadoalbum", length=50, nullable=false)
    private Boolean estadoAlbum;

    public Album(){

    }

    public Album(Integer id, String nombreAlbum, String fechaPublicacion, Boolean estadoAlbum) {
        this.id = id;
        this.nombreAlbum = nombreAlbum;
        this.fechaPublicacion = fechaPublicacion;
        this.estadoAlbum = estadoAlbum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Boolean getEstadoAlbum() {
        return estadoAlbum;
    }

    public void setEstadoAlbum(Boolean estadoAlbum) {
        this.estadoAlbum = estadoAlbum;
    }
    
}