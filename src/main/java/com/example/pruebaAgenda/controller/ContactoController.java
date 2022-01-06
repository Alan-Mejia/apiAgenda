package com.example.pruebaAgenda.controller;

import com.example.pruebaAgenda.model.Contacto;
import com.example.pruebaAgenda.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactoController {

    private ContactoService contactoService;

    public ContactoController(@Autowired ContactoService contactoService) {
        this.contactoService = contactoService;
    }

    @GetMapping("/contacto/{id}")
    public Contacto obterContacto(@PathVariable Integer id){
        return contactoService.getContacto(id);
    }

    @PostMapping("/contacto/create")
    public Contacto postContacto(@RequestBody Contacto contacto){
        return contactoService.postContacto(contacto);
    }

}
