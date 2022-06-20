package com.sena.disquera.controllers;

import javax.validation.Valid;

import com.sena.disquera.model.Cancion;
import com.sena.disquera.model.ICancion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SessionAttributes("cancion")
@RequestMapping("/cancion")
public class CancionController {
    @Autowired
    private ICancion cancioned;
    // @GetMapping("/index")
    // public String home(){
    //     return "redirect:/index";
    // }

    @GetMapping(path = {"","/listCancion"})
    public String listar(Model m){
        m.addAttribute("canciones", cancioned.findAll());
        return "views/cancion/listCancion";
    }
    
    @GetMapping(path = {"/ver/{id}"})
    public String ver(@PathVariable Integer id, Model  m){
        Cancion cancion=null;
        if (id > 0) {
            cancion = cancioned.findOne(id);
        } else {
            return "redirect:listCancion";
        }
        m.addAttribute("cancion", cancion);
        m.addAttribute("titulo","Editar Canción");
        m.addAttribute("accion",true);
        return "views/cancion/formCancion";
    }

    @GetMapping("/formCancion")
    public String formularioCanciones(Model m){
        Cancion cancion = new Cancion();
        m.addAttribute("cancion",cancion);
         m.addAttribute("titulo","Agregar Canción");
        m.addAttribute("accion",false);
        return "views/cancion/formCancion";
    }

    @PostMapping(path = {"/agregar"})
    public String agregar(@Valid Cancion cancion,BindingResult res, Model m,SessionStatus status){
        if (res.hasErrors()) {
            return "views/cancion/formCancion";
        }
        m.addAttribute("cancion", cancion);
        cancioned.save(cancion);
        status.setComplete();
        return "redirect:/cancion/listCancion";
    }

    @GetMapping("/delete/{idCancion}")
    public String delete(@PathVariable Integer idCancion) {
        if (idCancion > 0) {
            cancioned.delete(idCancion);
        }

        return "redirect:/cancion/listCancion";
    }
}
