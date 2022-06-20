package com.sena.disquera.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;


import javax.validation.Valid;

import com.sena.disquera.model.Genero;
import com.sena.disquera.model.IGenero;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@SessionAttributes("genero")
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    private IGenero generoed;

    @RequestMapping(value = "/listGenero", method = RequestMethod.GET)
    public String listarGeneros(Model m) {
        m.addAttribute("generos", generoed.findAll());
        return "views/genero/listGenero";
    }

    @RequestMapping(value = "/formGenero", method = RequestMethod.GET)
    public String formularioGeneros(Model m) {
        Genero genero = new Genero();
        m.addAttribute("genero", genero);
        m.addAttribute("titulo","Agregar Genero");
        m.addAttribute("accion",false);
        return "views/genero/formGenero";
    }

    @GetMapping(path = { "/ver/{id}" })
    public String ver(@PathVariable Integer id, Model m) {
        Genero genero = null;
        if (id > 0) {
            genero = generoed.findOne(id);
        } else {
            return "redirect:listGenero";
        }
        m.addAttribute("genero", genero);
        m.addAttribute("titulo","Editar Genero");
        m.addAttribute("accion",true);
        // key => ""
        return "views/genero/formGenero";
    }

    @GetMapping("/delete/{idGenero}")
    public String delete(@PathVariable Integer idGenero) {
        if (idGenero > 0) {
            generoed.delete(idGenero);
        }

        return "redirect:/genero/listGenero";
    }


    @PostMapping(path = { "/agregar" })
    public String agregar(@Valid Genero genero, BindingResult res, Model m, SessionStatus status ) {
        if (res.hasErrors()) {
            return "views/genero/formGenero";
        }
        // m.addAttribute("genero", genero);
        generoed.save(genero);
        status.setComplete();
        return "redirect:/genero/listGenero";
    }
}
