package com.example.pruebaAgenda.service;

import com.example.pruebaAgenda.model.Contacto;
import com.example.pruebaAgenda.repository.ContactoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactoServiceImpl implements ContactoService{

    private ContactoRepository contactoRepository;
    //ContactoService contactoService;


    public ContactoServiceImpl(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    @Override
    public Contacto getContacto(Integer id) {
        Optional<Contacto> contacto = contactoRepository.findById(id);
        return contacto.orElse(null);
    }

    @Override
    public Contacto postContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }
}
