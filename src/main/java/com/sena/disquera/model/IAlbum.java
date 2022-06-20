package com.sena.disquera.model;

import java.util.List;

public interface IAlbum {
    public List<Album> findAll();
    public void save(Album album);
    public Album findOne(Integer id);
    public void delete(Integer id);
}
