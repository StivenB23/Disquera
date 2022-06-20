package com.sena.disquera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cancion")
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCancion;

    @Column(name="nombrecancion", length=50, nullable=false)
    @NotEmpty
    private String nombreCancion;
    @Column(name="fecha", length=50, nullable=false)
    private String fecha;
    @NotEmpty
    @Column(name="duracion", length=50, nullable=false)
    private String duracion;
    @Column(name="estadocancion", length=50, nullable=false)
    private Boolean estadoCancion;

    public Cancion(){

    }

    public Cancion(Integer idCancion, String nombreCancion, String fecha, String duracion, Boolean estadoCancion) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.fecha = fecha;
        this.duracion = duracion;
        this.estadoCancion = estadoCancion;
    }

    public Integer getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(Integer idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Boolean getEstadoCancion() {
        return estadoCancion;
    }

    public void setEstadoCancion(Boolean estadoCancion) {
        this.estadoCancion = estadoCancion;
    }
    
    
}
