package com.sena.disquera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.disquera.model.Album;

@Service
public class AlbumServiceImpl implements IAlbumService {
    @Autowired
    private IAlbum albumed;

    @Override
    public List<Album> findAll() {
        return (List<Album>) albumed.findAll();
    }

    @Override
    public void save(Album album) {
        albumed.save(album);
    }

    @Override
    public Album findOne(Integer Id) {
        return albumed.findById(Id).orElse(null);
    }

    @Override
    public void delete(Integer Id) {
        albumed.deleteById(Id);
    }
    
}
