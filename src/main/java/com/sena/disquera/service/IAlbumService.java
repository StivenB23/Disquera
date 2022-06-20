package com.sena.disquera.service;

import java.util.List;

import com.sena.disquera.model.Album;

public interface IAlbumService {
    public List<Album> findAll();
    public void save(Album album);
    public Album findOne(Integer Id);
    public void delete(Integer Id);
}
