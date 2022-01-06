package com.example.pruebaAgenda.service;

import com.example.pruebaAgenda.model.Contacto;

public interface ContactoService {

    Contacto getContacto(Integer id);
    Contacto postContacto(Contacto contacto);

}
