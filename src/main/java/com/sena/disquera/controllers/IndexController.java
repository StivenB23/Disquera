package com.sena.disquera.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    // @RequestMapping(value = "/index", method = RequestMethod.GET)
    @GetMapping(path = {"/","","/index","home"} )
    public String index(){
        return "index";
    }

}
