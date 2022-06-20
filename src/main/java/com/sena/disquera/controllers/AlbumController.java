package com.sena.disquera.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.sena.disquera.model.Album;
// import com.sena.disquera.service.IAlbum;
import com.sena.disquera.service.IAlbumService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@SessionAttributes("album")
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private IAlbumService albumed;
    // @GetMapping("/index")
    // public String home(){
    //     return "redirect:/index";
    // }
    // @RequestMapping(value = "/listAlbum", method = RequestMethod.GET)
    @GetMapping("/listAlbum")
    public String listarAlbums(Model m){
         m.addAttribute("albums",albumed.findAll());
        return "views/album/listAlbum";
    }

    @GetMapping("/formAlbum")
    public String formularioAlbums(Model m){
        Album album = new Album();
        m.addAttribute("album", album);
        m.addAttribute("titulo","Agregar Album");
        m.addAttribute("accion",false);
        return "views/album/formAlbum";
    }

    @GetMapping(path = { "/ver/{id}" })
    public String ver(@PathVariable Integer id, Model m) {
        Album album = null;
        if (id > 0) {
            album = albumed.findOne(id);
        } else {
            return "redirect:listAlbum";
        }
        m.addAttribute("album", album);
        m.addAttribute("titulo","Editar Album");
        m.addAttribute("accion",true);
        // key => ""
        return "views/album/formAlbum";
    }

    @GetMapping("/delete/{idAlbum}")
    public String delete(@PathVariable Integer idAlbum) {
        if (idAlbum > 0) {
            albumed.delete(idAlbum);
        }

        return "redirect:/album/listAlbum";
    }


    @PostMapping(path = { "/agregar" })
    public String agregar(@Valid Album album, BindingResult res, Model m, SessionStatus status ) {
        if (res.hasErrors()) {
            return "views/album/formAlbum";
        }
        albumed.save(album);
        status.setComplete();
        return "redirect:/album/listAlbum";
    }
    
}