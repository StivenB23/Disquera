package com.sena.disquera.service;

import org.springframework.data.repository.CrudRepository;
import com.sena.disquera.model.Album;
public interface IAlbum extends CrudRepository<Album, Integer> {
    
}
