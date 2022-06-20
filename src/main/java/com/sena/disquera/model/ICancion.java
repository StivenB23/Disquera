package com.sena.disquera.model;

import java.util.List;

public interface ICancion {
    public List<Cancion> findAll();
    public void save(Cancion cancion);
    public Cancion findOne(Integer id);
    public void delete(Integer id);
} 